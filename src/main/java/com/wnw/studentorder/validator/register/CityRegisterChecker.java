package com.wnw.studentorder.validator.register;

import com.wnw.studentorder.domain.register.CityRegisterResponse;
import com.wnw.studentorder.domain.weeding.Person;
import com.wnw.studentorder.exception.CityRegisterException;
import com.wnw.studentorder.exception.TransportException;

public interface CityRegisterChecker {

    CityRegisterResponse checkPerson(Person person) throws CityRegisterException, TransportException;

}
