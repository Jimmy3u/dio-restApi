package me.dio.santanderbootcamp2023.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.santanderbootcamp2023.model.UserPost;
import me.dio.santanderbootcamp2023.service.PostsService;

@RestController
@RequestMapping("/post")
public class PostsController {
    private final PostsService postsService;

    public PostsController(PostsService postsService){
        this.postsService = postsService;
    }
    @GetMapping("/")
    public List<UserPost> findAll(){
        return postsService.findAll();
    }
    // TODO : Implementar POST

    @GetMapping("/{id}")
    public ResponseEntity<UserPost> findById(@PathVariable Long id){
        var post = postsService.findById(id);
        return ResponseEntity.ok(post);
    }
    
    @GetMapping("/u/{id}")
    public List<UserPost> findByUserId(@PathVariable Long id){
        return postsService.findByUserId(id);
    }
    
}
