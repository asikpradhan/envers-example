package com.example.data;

import com.example.data.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface ArticleRepository extends RevisionRepository<Article, Long, Integer>, JpaRepository<Article, Long> {
}
