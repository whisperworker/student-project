package com.wnw.studentorder.domain.weeding;

import java.time.LocalDate;

public class Child extends Person {

    private String certificateNubmer;
    private LocalDate issueDate;
    private String issueDepartment;

    public Child(String surname, String givenName, String patronymic,LocalDate dateOfBirth) {
        super(surname, givenName, patronymic, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Child{" +
                "certificateNubmer='" + certificateNubmer + '\'' +
                ", issueDate=" + issueDate +
                ", issueDepartment='" + issueDepartment + '\'' +
                ", surname='" + surname + '\'' +
                ", givenName='" + givenName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                '}';
    }

    public String getCertificateNubmer() {
        return certificateNubmer;
    }

    public void setCertificateNubmer(String certificateNubmer) {
        this.certificateNubmer = certificateNubmer;
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
