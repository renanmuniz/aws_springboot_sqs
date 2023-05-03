package com.renanmuniz.awsqs.controller;

import com.renanmuniz.awsqs.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqsController {

    @Autowired
    ProducerService service;

    @GetMapping("/send")
    public void sendMessageToQueue(@RequestBody String msg) {
        service.sendMessageToQueue(msg);
    }
}
