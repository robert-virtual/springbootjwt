package com.example.springbootjwt.controller;

import com.example.springbootjwt.model.Customer;
import com.example.springbootjwt.model.User;
import com.example.springbootjwt.repository.CustomerRepository;
import com.example.springbootjwt.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

    private final CustomerRepository customerRepository;
    private final UserRepository userRepository;

    public SecurityController(CustomerRepository customerRepository, UserRepository userRepository) {
        this.customerRepository = customerRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public String login(@RequestBody User body){
        return "login";
    }
    @PostMapping("/signup")
    public String signup(@RequestBody Customer body){
       customerRepository.save(body);
       //userRepository.save();
        return "signup";
    }
}
