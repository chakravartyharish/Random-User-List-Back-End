package com.example.randomuser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.randomuser.model.User;
import com.example.randomuser.service.UserService;

@SpringBootApplication
public class RandomUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(RandomUserApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(UserService userService) {
        return args -> {
            User user = new User();
            user.setFirstName("John");
            user.setLastName("Doe");
            user.setGender("Male");
            user.setEmail("john.doe@example.com");
            user.setPhone("1234567890");
            user.setPicture("https://example.com/john.jpg");
            userService.createUser(user);
        };
    }
}