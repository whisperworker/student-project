package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.AnswerChildren;
import com.wnw.studentorder.domain.weeding.StudentOrder;

public class ChildrenValidator {

    private String hostName;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children is checking:" + hostName);
        AnswerChildren ans = new AnswerChildren();
        return ans;
    }
}
