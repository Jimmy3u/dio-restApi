package me.dio.santanderbootcamp2023.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.santanderbootcamp2023.model.UserPost;
import me.dio.santanderbootcamp2023.repository.UserPostRepository;
import me.dio.santanderbootcamp2023.service.PostsService;

@Service
public class PostsServiceImpl implements PostsService {
    private final UserPostRepository posts;

    public PostsServiceImpl(UserPostRepository posts) {
        this.posts = posts;
    }

    @Override
    public List<UserPost> findAll() {
        return posts.findAll();
    }

    @Override
    public UserPost findById(Long id) {
        return posts.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<UserPost> findByUserId(Long id) {
        return posts.findByUser(id);
    }
}
