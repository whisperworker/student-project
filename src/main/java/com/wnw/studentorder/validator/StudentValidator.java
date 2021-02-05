package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.AnswerStudent;
import com.wnw.studentorder.domain.StudentOrder;

public class StudentValidator {

    public String hostName;

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is checking:" + hostName);
        AnswerStudent ans = new AnswerStudent();
        return ans;
    }
}
