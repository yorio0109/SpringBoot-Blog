package com.example.blog.dao;

import com.example.blog.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
    Post findById(Long id);
    void insert(Post post);
    void update(Post post);
    void delete(Long id);
}
