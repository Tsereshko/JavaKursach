package com.example.reception;

public class Patient extends Human{
    private String address;
    private Boolean gender;
    private String dateOfBirth;

    public Patient(int id, String firstname, String lastname, String patronymic, String phone, String dateOfBirth, String address, Boolean gender) {
        super(id, firstname, lastname, patronymic, phone);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }
}
