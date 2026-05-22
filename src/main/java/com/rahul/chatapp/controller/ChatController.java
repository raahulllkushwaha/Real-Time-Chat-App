package com.rahul.chatapp.controller;

import com.rahul.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping()
public class ChatContrller {
    @MessageMapping("/sendMsg")
    @SendTo("/topic/message")
    public ChatMessage sendMsg(ChatMessage message){
        return message;
    }
}
