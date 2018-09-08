package com.krotos.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown =true)
public class Student {

    private long id;
    private String name;
    private String passportNumber;

    public Student() {
    }

    public Student(long id, String name, String passportNumber) {

        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPasspotrNumber(String passpotrNumber) {
        this.passportNumber = passpotrNumber;
    }
}
