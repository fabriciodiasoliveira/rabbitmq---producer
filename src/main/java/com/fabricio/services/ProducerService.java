package com.fabricio.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Value("${queue.name}")
    private String queueName;
    @Autowired
    private RabbitTemplate template;

    public void sendMessage(String message) {
        this.template.convertAndSend(queueName, message);  // sends string message to my-queue
    }
}