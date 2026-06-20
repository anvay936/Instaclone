package com.core.instaclone.posts.controller;

import org.springframework.web.bind.annotation.*;
import com.core.instaclone.posts.entity.Post;

import java.util.List;
import com.core.instaclone.posts.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @PostMapping
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

}
