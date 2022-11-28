package com.example.demo.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.management.JMSConsumerStatsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableJms
public class SpringActiveMQConfig {
    
    @Autowired
    private ActiveMQConnectionFactory activeMQConnectionFactory;

    @Value("${activemq.broker.url}")
    private String brokerUrl;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("ParkYG-queue");
    }

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {
        activeMQConnectionFactory.setBrokerURL(brokerUrl);
        return activeMQConnectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        return new JmsTemplate(activeMQConnectionFactory);
    }
}
