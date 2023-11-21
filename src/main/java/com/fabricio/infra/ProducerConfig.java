package com.fabricio.infra;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {
    @Value("${queue.name}")
    private String queueName;
    @Bean
    public Queue myQueue() {  // creates my-queue automatically on the RabbitMQ server if not available
        return new Queue(queueName);
    }
}