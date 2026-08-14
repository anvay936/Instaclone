package com.core.instaclone.posts.dto;


import java.time.LocalDateTime;

public class PostResponse {
    private Integer id;

    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public PostResponse(){}

    public PostResponse(Integer id, String content, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getContent() {
        return content;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

}
