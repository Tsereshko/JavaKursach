package com.example.reception;

public class Doctor extends User{
    private String function;
    private Department department;
    private int cabinet;

    public Doctor(int id, String firstname, String lastname, String patronymic,
                  String phone, String username, String password, String function,
                  Department department, int cabinet) {
        super(id, firstname, lastname, patronymic, phone, username, password);
        this.function = function;
        this.department = department;
        this.cabinet = cabinet;
    }

}
