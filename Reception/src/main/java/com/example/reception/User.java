package com.example.reception;

public class User extends Human{
    protected String username;
    protected String password;

    public User(int id, String firstname, String lastname, String patronymic, String phone, String username, String password) {
        super(id, firstname, lastname, patronymic, phone);
        this.username = username;
        this.password = password;
    }
}
