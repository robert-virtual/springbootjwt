package com.example.springbootjwt.repository;

import com.example.springbootjwt.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
