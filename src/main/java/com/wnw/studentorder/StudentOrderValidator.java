package com.wnw.studentorder;

import com.wnw.studentorder.domain.*;
import com.wnw.studentorder.mail.MailSender;
import com.wnw.studentorder.validator.ChildrenValidator;
import com.wnw.studentorder.validator.CityRegisterValidator;
import com.wnw.studentorder.validator.StudentValidator;
import com.wnw.studentorder.validator.WeedingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeedingValidator weedingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){

        cityRegisterVal = new CityRegisterValidator();
        weedingVal = new WeedingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll(){

        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWeeding wedAnswer = checkWedding(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);

    }

    public StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWeeding checkWedding(StudentOrder so) {
        return weedingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
