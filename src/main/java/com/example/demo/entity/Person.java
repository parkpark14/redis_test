package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.redis.core.RedisHash;

import lombok.Getter;

// https://bcp0109.tistory.com/328 참고
@Getter
@RedisHash(value = "people", timeToLive = 30)
public class Person {
    
    @Id
    private String id;
    
    private String name;

    private Integer age;

    private LocalDateTime createdAt;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.createdAt = LocalDateTime.now();
    }
}
