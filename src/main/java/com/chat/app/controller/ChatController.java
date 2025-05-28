package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    // vrai request c'est : /app/sendMessage
     // et on est deja definie que /app  comme un listener donc toutes les url
    // vient de /app/... sont traitet par le serveur
    @MessageMapping("/sendMessage")  // cette annotation peret de dirige vers le serveur
    @SendTo("/topic/messages") // faire une send vers le canal /topic/messages
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    @GetMapping("/chat")
    public String chat(){
        return  "chat";
    }

}
