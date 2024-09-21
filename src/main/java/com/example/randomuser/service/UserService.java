package com.example.randomuser.service;

import com.example.randomuser.model.User;
import com.example.randomuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> searchUsersByName(String name) {
        return userRepository.findByFirstNameContainingOrLastNameContaining(name, name);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User userDetails) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setFirstName(userDetails.getFirstName());
            existingUser.setLastName(userDetails.getLastName());
            existingUser.setGender(userDetails.getGender());
            existingUser.setEmail(userDetails.getEmail());
            existingUser.setPhone(userDetails.getPhone());
            existingUser.setPicture(userDetails.getPicture());
            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}