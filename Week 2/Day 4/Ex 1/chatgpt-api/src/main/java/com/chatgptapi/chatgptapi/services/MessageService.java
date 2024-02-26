package com.chatgptapi.chatgptapi.services;

import com.chatgptapi.chatgptapi.models.Message;
import com.chatgptapi.chatgptapi.repositories.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMessage(String role, String content, int conversationId) {
        Message message = new Message(role, content, conversationId);
        return messageRepository.save(message);
    }
}
