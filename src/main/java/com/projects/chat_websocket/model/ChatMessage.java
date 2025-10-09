package com.projects.chat_websocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChatMessage {
    private UUID id = UUID.randomUUID();
    private String sender;
    private  String msg;
}
