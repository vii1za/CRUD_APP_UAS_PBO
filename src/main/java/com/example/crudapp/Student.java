package com.example.crudapp;

public class Student {
    private String name;
    private String address;

    // Constructor tanpa parameter
    public Student() {
    }

    // Constructor dengan parameter
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter dan Setter untuk Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter untuk Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString() untuk debugging atau mencetak data
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
