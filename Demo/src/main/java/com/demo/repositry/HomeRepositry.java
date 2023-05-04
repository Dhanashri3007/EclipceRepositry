package com.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

public interface HomeRepositry extends JpaRepository<User, Integer>{

}
