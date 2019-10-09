package com.eurekachat.spring.repository;

import com.eurekachat.spring.model.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<ChatMessage,String> {
}
