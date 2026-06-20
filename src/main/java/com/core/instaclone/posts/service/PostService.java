package com.core.instaclone.posts.service;

import com.core.instaclone.posts.entity.Post;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private static Integer id = 0;
    private static List<Post> store = new ArrayList<>();

    public Post createPost(Post post){
        id++;
        Post savedPost = new Post(id, post.getContent());
        store.add(savedPost);
        return savedPost;
    }

    public List<Post> getAllPosts(){
        return store;
    }
}
