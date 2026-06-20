package com.core.instaclone.posts.entity;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDateTime;

public class Post {
    private Integer id;

    @NotBlank
    private String content;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Post(){}

    public Post(Integer id, String content){
        this.id = id;
        this.content = content;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt(){return createdAt;}

    public void setCreatedAT(){this.createdAt = LocalDateTime.now();}

    public LocalDateTime getUpdatedAt(){return updatedAt;}

    public void setUpdatedAt(){this.updatedAt = LocalDateTime.now();}
}
