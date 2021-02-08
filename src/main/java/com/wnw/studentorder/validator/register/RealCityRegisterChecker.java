package com.wnw.studentorder.validator.register;

import com.wnw.studentorder.domain.register.CityRegisterResponse;
import com.wnw.studentorder.domain.weeding.Person;
import com.wnw.studentorder.exception.CityRegisterException;
import com.wnw.studentorder.exception.TransportException;

public class RealCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException {
        return null;
    }
}
