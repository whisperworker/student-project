package com.wnw.studentorder.validator;

import com.wnw.studentorder.domain.register.AnswerCityRegister;
import com.wnw.studentorder.domain.register.AnswerCityRegisterItem;
import com.wnw.studentorder.domain.weeding.Child;
import com.wnw.studentorder.domain.weeding.Person;
import com.wnw.studentorder.exception.TransportException;
import com.wnw.studentorder.validator.register.CityRegisterChecker;
import com.wnw.studentorder.domain.register.CityRegisterResponse;
import com.wnw.studentorder.domain.weeding.StudentOrder;
import com.wnw.studentorder.exception.CityRegisterException;
import com.wnw.studentorder.validator.register.FakeCityRegisterChecker;

import java.util.List;

public class CityRegisterValidator {

    public static final String IN_CODE = "NO_GRN";

    private CityRegisterChecker personChecker;

    public CityRegisterValidator(){
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {

            AnswerCityRegister ans = new AnswerCityRegister();

            ans.addItem(checkPerson(so.getHusband()));
            ans.addItem(checkPerson(so.getWife()));

            List<Child> children = so.getChildren();

            for (Child child: children) {
                ans.addItem(checkPerson(child));
            }

        return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {

        AnswerCityRegisterItem.CityStatus status = null;
        AnswerCityRegisterItem.CityError error = null;

        try {
            CityRegisterResponse tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ?
                    AnswerCityRegisterItem.CityStatus.YES :
                    AnswerCityRegisterItem.CityStatus.NO;
        }
        catch (CityRegisterException ex){
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(ex.getCode(), ex.getMessage());
        } catch (TransportException ex) {
            ex.printStackTrace(System.out);
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(IN_CODE, ex.getMessage());
        }

        AnswerCityRegisterItem answer = new AnswerCityRegisterItem(status, person, error);

        return answer;
    }
}
