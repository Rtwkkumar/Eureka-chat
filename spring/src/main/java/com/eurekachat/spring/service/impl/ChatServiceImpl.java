package com.eurekachat.spring.service.impl;

import com.eurekachat.spring.dao.ChatMessageDao;
import com.eurekachat.spring.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;

public class ChatServiceImpl implements ChatService {
    @Autowired
    ChatMessageDao chatMessageDao;
}
