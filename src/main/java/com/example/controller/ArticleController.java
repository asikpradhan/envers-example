package com.example.controller;

import com.example.data.entity.Article;
import com.example.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/articles/history/{id}")
    public List<Article> history(@PathVariable Long id) {
        return articleService.articleHistory(id);
    }
}
