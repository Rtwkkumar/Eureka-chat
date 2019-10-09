package com.eurekachat.spring.model.entity;

import javax.persistence.Id;

import com.eurekachat.spring.model.enums.MessageType;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChatMessageDao {
    @Id
    private String id;
    private MessageType type;
    private String sender;
    private String recipient;

}
