
package com.example.notification.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "order-topic", groupId = "notification-group")
    public void notifyUser(String message) {
        System.out.println("Sending notification: " + message);
    }
}
