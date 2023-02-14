package com.example.springbootjwt.controller;

import com.example.springbootjwt.model.Customer;
import com.example.springbootjwt.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/all")
    public Iterable<Customer> getAll(){
        return customerRepository.findAll();
    }
}
