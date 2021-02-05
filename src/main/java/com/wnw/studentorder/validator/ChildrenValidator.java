package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.AnswerChildren;
import com.wnw.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public String hostName;

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is checking:" + hostName);
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }
}
