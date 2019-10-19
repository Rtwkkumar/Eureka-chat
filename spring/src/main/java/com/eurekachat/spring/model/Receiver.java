package com.eurekachat.spring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

@Data
@ToString
@Setter
@Getter
public class Receiver extends Person{
    @Id
    private String rxrphoneNo;



}
