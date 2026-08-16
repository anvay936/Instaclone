package com.core.instaclone.posts.controller;

import com.core.instaclone.posts.dto.PostRequest;
import com.core.instaclone.posts.dto.PostResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public PostResponse createPost(@Valid @RequestBody PostRequest postRequest){
        return postService.createPost(postRequest);
    }

    @GetMapping
    public List<PostResponse> getAllPosts(){
        return postService.getAllPosts();
    }

    @PutMapping("/{id}")
    public PostResponse updatePost(@PathVariable Integer id, @Valid @RequestBody PostRequest updateRequest){
        return postService.updatePost(id, updateRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Integer id){
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}
