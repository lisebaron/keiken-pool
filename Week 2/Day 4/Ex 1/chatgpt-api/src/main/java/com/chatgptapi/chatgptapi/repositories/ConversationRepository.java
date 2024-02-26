package com.chatgptapi.chatgptapi.repositories;

import com.chatgptapi.chatgptapi.models.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Integer> {

}
