
package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.kafka.core.KafkaTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public String createOrder(@RequestBody String order) {
        kafkaTemplate.send("order-topic", order);
        return "Order sent: " + order;
    }
}
