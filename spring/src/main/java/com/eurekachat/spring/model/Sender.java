package com.eurekachat.spring.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;

@Data
@ToString
public class Sender {
    @Id
    private String phone;
    private String name;
    private String email;
    private String dateOfBirth;
    private String orgId;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }


    @Override
    public String toString() {
        return "Sender{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", orgId='" + orgId + '\'' +
                '}';
    }
}
