package com.eurekachat.spring.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

/**
 * @author ritwik.kumar
 */
@Data
@ToString
@Getter
@Setter
public class Person {
    @Id
    private String phone;
    private String name;
    private String email;
    private String dateOfBirth;
    private String orgId;
}
