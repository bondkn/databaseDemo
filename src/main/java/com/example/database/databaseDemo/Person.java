package com.example.database.databaseDemo;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Person {

    private Integer id;
    private String name;
    private String emailid;
    private Date birthdate;

    public Person(){

    }

    public Person(Integer id, String name, String emailId, Date birthDate) {
        this.id = id;
        this.name = name;
        this.emailid = emailId;
        this.birthdate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailid + '\'' +
                ", birthDate=" + birthdate +
                '}';
    }
}
