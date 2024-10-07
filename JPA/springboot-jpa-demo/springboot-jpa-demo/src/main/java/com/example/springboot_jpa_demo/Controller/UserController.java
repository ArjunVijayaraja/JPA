package com.example.springboot_jpa_demo.Controller;

import com.example.springboot_jpa_demo.Entity.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot_jpa_demo.Service.userService;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController{
    private userService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
       // System.out.println(user.getId());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
       User savedUser =  userService.createUser(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

    }
}
