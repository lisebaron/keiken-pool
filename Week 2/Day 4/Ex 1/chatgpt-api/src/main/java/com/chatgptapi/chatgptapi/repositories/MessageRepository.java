package com.chatgptapi.chatgptapi.repositories;

import com.chatgptapi.chatgptapi.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}