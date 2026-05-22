package com.rahul.chatapp.controller;

import com.rahul.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping()
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMsg(ChatMessage message){
        return message;
    }

    @GetMapping("chat")
    public String chat(){

        return "chat";
    }
}
