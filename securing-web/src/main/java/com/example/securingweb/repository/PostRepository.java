package com.example.securingweb.repository;

import com.example.securingweb.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
