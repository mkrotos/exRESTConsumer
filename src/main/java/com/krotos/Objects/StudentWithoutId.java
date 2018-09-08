package com.krotos.Objects;

public class StudentWithoutId {

    private String name;
    private String passportNumber;

    public StudentWithoutId() {
    }

    public StudentWithoutId(String name, String passportNumber) {

        this.name = name;
        this.passportNumber = passportNumber;
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

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "StudentWithoutId{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
