package com.engripaye.chatter_cart.NoticationService;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    private final SimpMessagingTemplate messagingTemplate;

    public NotificationController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendOrderUpdate(Long orderId, String message) {
        messagingTemplate.convertAndSend("/topic/orders/" + orderId, message);
    }
}
