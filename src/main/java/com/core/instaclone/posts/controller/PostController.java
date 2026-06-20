package com.core.instaclone.posts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.core.instaclone.posts.entity.Post;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private static Integer id1 = 0;
    private static List<Post> store = new ArrayList<>();
    @PostMapping
    public void createPost(String content){
        id1++;
        store.add(new Post(id1,content));
    }

    @GetMapping
    public List<Post> getAllPosts(){
        return store;
    }

}
