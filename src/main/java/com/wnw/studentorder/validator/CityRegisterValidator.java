package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.AnswerCityRegister;
import com.wnw.studentorder.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;


    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City register is running:" + hostName);
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
