package com.example.randomuser.repository;

import com.example.randomuser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}