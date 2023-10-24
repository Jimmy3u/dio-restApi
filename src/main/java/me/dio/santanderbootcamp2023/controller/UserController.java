package me.dio.santanderbootcamp2023.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import me.dio.santanderbootcamp2023.model.User;
import me.dio.santanderbootcamp2023.service.UserService;

@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    // TODO : Implementar registro do usuario (POST)

    // TODO : Implementar deletar usuario (DEL)

    // TODO : Implementar Troca de Usuario / Avatar (PATCH)
}
