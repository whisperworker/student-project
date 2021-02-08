package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.AnswerWeeding;
import com.wnw.studentorder.domain.weeding.StudentOrder;

public class WeedingValidator {

    private String hostName;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AnswerWeeding checkWedding(StudentOrder so) {
        System.out.println("Wedding is checking:" + hostName);
        AnswerWeeding ans = new AnswerWeeding();
        return ans;
    }
}
