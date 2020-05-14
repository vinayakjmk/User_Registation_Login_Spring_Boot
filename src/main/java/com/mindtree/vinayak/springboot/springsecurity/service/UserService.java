package com.mindtree.vinayak.springboot.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mindtree.vinayak.springboot.springsecurity.model.User;
import com.mindtree.vinayak.springboot.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
