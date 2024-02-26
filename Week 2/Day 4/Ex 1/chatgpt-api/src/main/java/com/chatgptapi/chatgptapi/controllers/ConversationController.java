package com.chatgptapi.chatgptapi.controllers;

import com.chatgptapi.chatgptapi.models.Conversation;
import com.chatgptapi.chatgptapi.services.ConversationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class ConversationController {

    private final ConversationService conversationService;

    public ConversationController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @GetMapping
    public List<Conversation> getConversations() {
        return null;
    }

    @PostMapping("/conversation/create")
    public ResponseEntity<Conversation> createConversation () {
        Conversation createdConv = conversationService.createConversation();
        return ResponseEntity.created(URI.create("/conversation/create")).body(createdConv);
    }

    public void deleteConversation(@RequestParam int id) {

    }
}
