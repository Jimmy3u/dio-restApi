package me.dio.santanderbootcamp2023.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.santanderbootcamp2023.model.User;
import me.dio.santanderbootcamp2023.repository.UserRepository;
import me.dio.santanderbootcamp2023.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository users;

    public UserServiceImpl(UserRepository users) {
        this.users = users;
    }

    @Override
    public User findById(Long id) {
        return users.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<User> findAll() {
        return users.findAll();
    }

    @Override
    public User createNewUser(User newUser) {
        return users.save(newUser);
    }
}
