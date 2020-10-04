package com.example.data.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Audited
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

}
