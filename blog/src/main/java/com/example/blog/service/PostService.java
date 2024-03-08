package com.example.blog.service;

import com.example.blog.entity.Post;


import java.util.List;

public interface PostService {
    List<Post> findAll();
    Post findById(Long id);
    void save(Post post);
    void update(Post post);
    void delete(Long id);
}
