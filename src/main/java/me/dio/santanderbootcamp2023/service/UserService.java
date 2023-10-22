package me.dio.santanderbootcamp2023.service;

import java.util.List;

import me.dio.santanderbootcamp2023.model.User;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    User createNewUser(User newUser);
}
