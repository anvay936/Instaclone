package com.core.instaclone.posts.service;

import com.core.instaclone.posts.dto.PostResponse;
import com.core.instaclone.posts.dto.PostRequest;
import com.core.instaclone.posts.entity.Post;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private static Integer id = 0;
    private static final List<Post> store = new ArrayList<>();

    public PostResponse createPost(PostRequest postRequest){
        Post savedPost = toPost(postRequest);
        store.add(savedPost);
        return toPostResponse(savedPost);
    }

    public List<PostResponse> getAllPosts(){

        List<PostResponse> posts = new ArrayList<>();
        for(Post p:store){
            posts.add(toPostResponse(p));
        }
        return posts;
    }

    private Post toPost(PostRequest postRequest){
        id++;
        return new Post(id, postRequest.getContent());
    }

    private PostResponse toPostResponse(Post savedPost){
        return new PostResponse(savedPost.getId(), savedPost.getContent(), savedPost.getCreatedAt(), savedPost.getUpdatedAt());
    }
}
