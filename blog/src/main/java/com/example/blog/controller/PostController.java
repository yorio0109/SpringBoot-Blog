package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.blog.entity.Post;
import com.example.blog.service.PostService;

import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {
private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String index(Model model) {
        List<Post> posts = postService.findAll();
        model.addAttribute("title", "投稿一覧");
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        Post post = postService.findById(id);
        model.addAttribute("title", "投稿詳細");
        model.addAttribute("post", post);
        return "posts/detail";
    }
}
