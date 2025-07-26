package com.ivrndev.ivernchatapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ChatMessage {
    String messageId;
    String message;
    String senderId;
    String receiverId;
    LocalDateTime timestamp;
}
