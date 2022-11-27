package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Person;

public interface PersonRedisRepository extends CrudRepository<Person, String>{
    
}
