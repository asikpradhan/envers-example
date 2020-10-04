package com.example.service;

import com.example.data.ArticleRepository;
import com.example.data.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> articleHistory(Long id) {
        return articleRepository.findRevisions(id).stream().map(revision -> revision.getEntity()).collect(Collectors.toList());
    }
}
