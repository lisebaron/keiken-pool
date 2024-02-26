package com.chatgptapi.chatgptapi.services;

import com.chatgptapi.chatgptapi.models.Conversation;
import com.chatgptapi.chatgptapi.repositories.ConversationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ConversationService {

    private final ConversationRepository conversationRepository;
    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }

    public Conversation createConversation() {
        Conversation conversation = new Conversation();
        return conversationRepository.save(conversation);
    }
}
