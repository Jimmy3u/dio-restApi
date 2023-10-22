package me.dio.santanderbootcamp2023.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.santanderbootcamp2023.model.UserPost;

@RestController
@RequestMapping("/post")
public class PostsController {

    // TODO : Implementar post por id
    @GetMapping("/{id}")
    public ResponseEntity<UserPost> findById(@PathVariable Long id){
        return ResponseEntity.ok(new UserPost());
    }
}
