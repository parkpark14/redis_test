package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.TestaEntity;

public interface TestaDao extends JpaRepository<TestaEntity, String>{
    
    // JPQL
    @Query(value = "select te.val1 from TestaEntity te where te.key = ?1")
    public int testaVal1(int key);
    
    // 일반 query
    @Query(value = "select te.val2 from testa te where te.key = ?1", nativeQuery = true)
    public int testaVal2(int key);
}
