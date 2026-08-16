package com.core.instaclone.posts.service;

import com.core.instaclone.exception.ResourceNotFoundException;
import com.core.instaclone.posts.dto.PostResponse;
import com.core.instaclone.posts.dto.PostRequest;
import com.core.instaclone.posts.entity.Post;
import com.core.instaclone.posts.repository.PostRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository){
        this.repository = repository;
    }

    public PostResponse createPost(PostRequest postRequest){
        Post savedPost = toPost(postRequest);
        repository.save(savedPost);
        return toPostResponse(savedPost);
    }

    public List<PostResponse> getAllPosts(){

        List<PostResponse> posts = new ArrayList<>();
        for(Post p:repository.findAll()){
            posts.add(toPostResponse(p));
        }
        return posts;

//        return repository.findAll()
//                .stream()
//                .map(this::toPostResponse)
//                .toList();
    }

    public PostResponse updatePost(Integer id, PostRequest updateRequest){
        Post editPost = repository.findById(id);
        if(editPost == null){
            throw new ResourceNotFoundException("Post not found with id " + id);
        }
        editPost.setContent(updateRequest.getContent());
        editPost.setUpdatedAt();
        return toPostResponse(editPost);
    }

    public void deletePost(Integer id){
        if(repository.findById(id) == null){
            throw new ResourceNotFoundException("Post not found with id " + id);

        }
        else{
            repository.delete(id);
        }
    }

    private Post toPost(PostRequest postRequest){
        return new Post(null, postRequest.getContent());
    }

    private PostResponse toPostResponse(Post savedPost){
        return new PostResponse(savedPost.getId(), savedPost.getContent(), savedPost.getCreatedAt(), savedPost.getUpdatedAt());
    }
}
