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
public class Sender extends Person{
    @Id
    private String phone;


}
