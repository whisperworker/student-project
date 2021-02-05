package com.wnw.studentorder.domain;

import java.time.LocalDate;

public class Person extends Object{

    protected String surname;
    protected String givenName;
    protected String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public Person(){
        System.out.println("Person is created");
    }

    public Person(String surname, String givenName, String patronymic) {
        this.surname = surname;
        this.givenName = givenName;
        this.patronymic = patronymic;
    }

    public String getPersonString(){
        return surname + " " + givenName + " " + patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
