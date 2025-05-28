package com.chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor
@Setter
@Getter
public class ChatMessage {
    private Long id;
    private String sender ;
    private String content ;
    
}
