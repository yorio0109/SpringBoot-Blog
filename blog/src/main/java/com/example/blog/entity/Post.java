package com.example.blog.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Post {
    
    private Long id;
    private String title;
    private String content;
    private Date createdAt;
    private Date updatedAt;
}
