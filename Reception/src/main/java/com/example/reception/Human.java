package com.example.reception;

public class Human {
    protected int id;
    protected String firstname;
    protected String lastname;
    protected String patronymic;
    protected String phone;

    public Human(int id, String firstname, String lastname, String patronymic, String phone) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.phone = phone;
    }
}
