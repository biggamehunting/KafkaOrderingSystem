
package com.example.payment.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void process(String message) {
        System.out.println("Processing payment: " + message);
    }
}
