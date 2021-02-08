package com.wnw.studentorder;

import com.wnw.studentorder.domain.weeding.Address;
import com.wnw.studentorder.domain.weeding.Adult;
import com.wnw.studentorder.domain.weeding.Child;
import com.wnw.studentorder.domain.weeding.StudentOrder;

import java.time.LocalDate;

public class SaveStudentOrder {

    public static void main(String[] args) {
        System.out.println(buildStudentOrder(1).getChildren());
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 200;
        System.out.println("saveStudentOrder:");

        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        Address adress = new Address("St. Yanki", "240a", "12", "37", "23006");

        Adult husband = new Adult("Piotr", "Sidorov","Sergeyevich",
                LocalDate.of(1994,9,11));
        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("2467586");
        husband.setIssueDate(LocalDate.of(2017,9,14));
        husband.setIssueDepartment("Police department №" + id);
        husband.setUniversity("Grsu");
        husband.setStudentId("" + (1000 + id));
        husband.setAddress(adress);

        Adult wife = new Adult("Elena", "Sidorova", "Sergeevna",
                LocalDate.of(1993, 7, 15));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("2411254");
        wife.setIssueDate(LocalDate.of(2018,9,14));
        wife.setIssueDepartment("Police department №" + id);
        wife.setUniversity("Grsu");
        wife.setStudentId("" + (2000 + id));
        wife.setAddress(adress);

        Child child1 = new Child("Piotr", "Sidorov", "Pietrovich",
                LocalDate.of(2016,9,11));
        child1.setCertificateNubmer("" + (3000 + id));
        child1.setIssueDate(LocalDate.of(2016, 10, 11));
        child1.setIssueDepartment("Department №" + id);
        child1.setAddress(adress);

        Child child2 = new Child("Ivan", "Sidorov", "Pietrovich",
                LocalDate.of(2019,9,11));
        child2.setCertificateNubmer("" + (4000 + id));
        child2.setIssueDate(LocalDate.of(2020, 10, 11));
        child2.setIssueDepartment("Department №" + id);
        child2.setAddress(adress);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }
}
