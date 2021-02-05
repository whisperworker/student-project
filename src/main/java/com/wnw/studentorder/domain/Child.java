package com.wnw.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person{

    private String certificateNubmer;
    private LocalDate issueDate;
    private String issueDepartment;

    public Child(String surname, String givenName, String patronymic) {
        super(surname, givenName, patronymic);
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
