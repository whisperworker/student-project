package com.wnw.studentorder;

import com.wnw.studentorder.domain.Adult;
import com.wnw.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
    buildStudentOrder();
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 200;
        System.out.println("saveStudentOrder:");

        return answer;
    }

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult("Alex", "Sidorov", "Sergeyevich",
                "KH", "2147598");

        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);

        return so;
    }
}
