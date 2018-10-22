package com.example.currencyexchange.service;

import com.example.currencyexchange.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

    public User findByUsername(String username);
}
