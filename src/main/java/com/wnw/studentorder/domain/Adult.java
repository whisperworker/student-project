package com.wnw.studentorder.domain;

import java.time.LocalDate;
import java.time.Period;

public class Adult extends Person{

    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String university;
    private String studentId;

    public Adult(){
        System.out.println("Adult is created");
    }

    public Adult(String surname, String givenName, String patronymic, String passportSeria, String passportNumber) {
        super(surname, givenName, patronymic);
        this.passportSeria = passportSeria;
        this.passportNumber = passportNumber;
    }

    @Override
    public String getPersonString(){
        return surname + " " + givenName + " " + patronymic + ":" + passportSeria + passportNumber;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
