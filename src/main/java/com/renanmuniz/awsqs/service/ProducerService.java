package com.renanmuniz.awsqs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String endpoint;

    public void sendMessageToQueue(String message) {
        System.out.println("Sending message: " + message);
        queueMessagingTemplate.send(endpoint, MessageBuilder.withPayload(message).build());
    }
}
