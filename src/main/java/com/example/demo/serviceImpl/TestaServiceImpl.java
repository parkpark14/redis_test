package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestaDao;
import com.example.demo.service.TestaService;

@Service
public class TestaServiceImpl implements TestaService{
    
    @Autowired
    private TestaDao testaDao;

    @Override
    public int testaVal1(int key) {

        int testaValue1 = testaDao.testaVal1(key);
        return testaValue1;
    }

    @Override
    public int testaVal2(int key) {
        return testaDao.testaVal2(key);
    }
}
