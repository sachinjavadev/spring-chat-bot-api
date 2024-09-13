package com.chatboot;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@Controller
public class WebSocketController {

    @MessageMapping("/send")
    @SendTo("/topic/your-topic")
    public String sendMessage(String message) {
        return message;
    }
}
