package com.example.demo.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value = "/produce")
public class ProducerController {
    
    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @PostMapping(value = "/message")
    public Student sendMessage(@RequestBody Student student ) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String studentAcJson = mapper.writeValueAsString(student);

            jmsTemplate.convertAndSend(queue, studentAcJson);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return student;
    }
}
