package com.kochkinaHW.hw2.Libraries.service;

import com.kochkinaHW.hw2.Libraries.exception.WrongNameEmployee;
import com.kochkinaHW.hw2.Libraries.exception.WrongSurnameEmployee;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    public String validateName(String firstName){
        if(!StringUtils.isAlpha(firstName)){
            throw new WrongNameEmployee();
        }
        return StringUtils.capitalize(firstName.toLowerCase());
    }

    public String validateSurname(String lastName){
        String[] surnames = lastName.split("-");
        for (int i = 0; i < surnames.length; i++) {
            String surname = surnames[i];
            if(!StringUtils.isAlpha(lastName)){
                throw new WrongSurnameEmployee();
            }
            surnames[i] = StringUtils.capitalize(lastName.toLowerCase());
        }
        return String.join("-", surnames);
    }
}
