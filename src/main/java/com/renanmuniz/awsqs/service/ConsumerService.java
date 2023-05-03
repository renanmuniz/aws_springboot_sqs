package com.renanmuniz.awsqs.service;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @SqsListener("my-learning-queue")
    public void loadMessageFromSQS(String message) {
        System.out.println("Message received: " + message);
    }

}
