package com.example.springbootjwt.repository;

import com.example.springbootjwt.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
