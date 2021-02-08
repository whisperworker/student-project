package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.AnswerStudent;
import com.wnw.studentorder.domain.weeding.StudentOrder;

public class StudentValidator {

    private String hostName;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student is checking:" + hostName);
        AnswerStudent ans = new AnswerStudent();
        return ans;
    }
}
