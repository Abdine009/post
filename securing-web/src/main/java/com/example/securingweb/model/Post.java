package com.example.securingweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDateTime;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private  String slug;
    private  String content;
    private String author;
    private LocalDateTime publishedOn;
    private  LocalDateTime updatedOn;

    public Post(){}

    public Post(String title, String slug, String content, String author){

        this.title = title;
        this.slug = slug;
        this.content= content;
        this.author= author;
        this.publishedOn= LocalDateTime.now();
    }

}
