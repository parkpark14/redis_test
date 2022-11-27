package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PygDao;
import com.example.demo.service.PygService;

@Service
public class PygServiceImpl implements PygService{

    @Autowired
    private PygDao pygDao;

    @Override
    public int val1() {
        return 0;
    }

    @Override
    public int val2() {
        return 0;
    }
    
}
