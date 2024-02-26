package com.chatgptapi.chatgptapi.controllers;

import com.chatgptapi.chatgptapi.models.Message;
import com.chatgptapi.chatgptapi.services.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/message/create")
    public ResponseEntity<Message> createConversation (@RequestBody Message request) {
        Message createdmessage = messageService.createMessage(request.getRole(), request.getContent(), request.getConversationId());
        return ResponseEntity.created(URI.create("/message/create")).body(createdmessage);
    }

}
