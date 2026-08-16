package com.core.instaclone.posts.repository;

import com.core.instaclone.posts.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {
    private static Integer id = 0;
    private static final List<Post> store = new ArrayList<>();

    public void save(Post post){
        post.setId(++id);
        store.add(post);
    }
    public List<Post> findAll(){
        return new ArrayList<>(store);
    }
    public Post findById(int id){
        for(Post p:store){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void delete(int id){
        for(int i=0;i<store.size();i++){
            if(store.get(i).getId() == id){
                store.remove(i);
            }
        }
    }
}
