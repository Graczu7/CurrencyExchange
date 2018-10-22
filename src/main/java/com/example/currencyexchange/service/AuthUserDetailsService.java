package com.example.currencyexchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class AuthUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public AuthUserDetailsService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
        return Optional.ofNullable(userRepository.findByUsername(username)).orElseThrow(
                () ->new UsernameNotFoundException("User not found")
        );
    }
}
