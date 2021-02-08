package com.wnw.studentorder.validator.register;

import com.wnw.studentorder.domain.register.CityRegisterResponse;
import com.wnw.studentorder.domain.weeding.Adult;
import com.wnw.studentorder.domain.weeding.Child;
import com.wnw.studentorder.domain.weeding.Person;
import com.wnw.studentorder.exception.CityRegisterException;
import com.wnw.studentorder.exception.TransportException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    private static final String GOOD_1 = "1000";
    private static final String GOOD_2 = "2000";
    private static final String GOOD_3 = "3000";

    private static final String BAD_1 = "1001";
    private static final String BAD_2 = "2001";
    private static final String BAD_3 = "3001";

    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";
    private static final String ERROR_3 = "3002";
    private static final String ERROR_T_1 = "1003";
    private static final String ERROR_T_2 = "2003";


    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException {

        CityRegisterResponse result = new CityRegisterResponse();

        if(person instanceof Adult){
            Adult t = (Adult) person;
            String ps = t.getPassportSeria();
            if(ps.equals(GOOD_1) || ps.equals(GOOD_2)){
                result.setExisting(true);
                result.setTemporal(false);
            }
            if(ps.equals(BAD_1) || ps.equals(BAD_2)){
                result.setExisting(false);
            }
            if(ps.equals(ERROR_1) || ps.equals(ERROR_2)){
                CityRegisterException ex = new CityRegisterException("1", "GRN ERROR" + ps);
                throw ex;
            }

            if(ps.equals(ERROR_T_1) || ps.equals(ERROR_T_2)){
                TransportException ex = new TransportException("Tansport Error" + ps);
                throw ex;
            }
        }

        if(person instanceof Child){
            Child t = (Child) person;
            String certNumber = t.getCertificateNubmer();
            if(certNumber.equals(GOOD_3)){
                result.setExisting(true);
                result.setTemporal(true);
            }
            if(certNumber.equals(BAD_3)){
                result.setExisting(false);
            }
            if(certNumber.equals(ERROR_3)){
                CityRegisterException ex = new CityRegisterException();
                throw ex;
            }
        }

        System.out.println(result);

        return result;
    }
}
