package com.eurekachat.spring.model;

import com.eurekachat.spring.model.enums.MessageType;
import lombok.Data;

@Data
public class ChatMessage {
  private MessageType type;
  private String content;
  private String sender;
  private String recepient;
}
