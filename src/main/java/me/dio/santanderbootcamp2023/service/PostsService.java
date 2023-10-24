package me.dio.santanderbootcamp2023.service;

import java.util.List;

import me.dio.santanderbootcamp2023.model.UserPost;

public interface PostsService {
    
    List<UserPost> findAll();
    UserPost findById(Long id);
    List<UserPost> findByUserId(Long id);
}
