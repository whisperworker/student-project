package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.AnswerWeeding;
import com.wnw.studentorder.domain.StudentOrder;

public class WeedingValidator {

    public String hostName;

    public AnswerWeeding checkWedding(StudentOrder so) {
        System.out.println("Wedding is checking:" + hostName);
        AnswerWeeding ans = new AnswerWeeding();
        return ans;
    }
}
