package com.eurekachat.spring.dao.impl;

import com.eurekachat.spring.dao.ChatMessageDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ChatMessageDaoImpl implements ChatMessageDao {

    @Autowired
    ChatMessageDao chatMessageDao;
}
