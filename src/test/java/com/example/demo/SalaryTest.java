package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SalaryTest {

    @Test
    public void validateSalary_IfSalaryMoreThan15k_ExceptionBooleanTrue() {
        Salary salary = new Salary();
        //Given
        Double inputSalary = 16000.00;

        //When


        Boolean validateSalaryRes = salary.validateSalary(inputSalary);

        //Then
        assertTrue(validateSalaryRes);
    }

    @Test
    public void validateSalary_IfSalaryLessThan15k_ExceptionBooleanFalse() {
        Salary salary = new Salary();
        //Given
        Double inputSalary = 14000.00;

        //When


        Boolean validateSalaryRes = salary.validateSalary(inputSalary);

        //Then
        assertFalse(validateSalaryRes);
    }

    //TODO:: validateSalary_SalaryIsNull_ExceptionBooleanFalse
    @Test
    public void validateSalary_SalaryIsNull_ExceptionBooleanFalse() {
        Salary salary = new Salary();
        //Given
        Double inputSalary = null;

        //When


        Boolean validateSalaryRes = salary.validateSalary(inputSalary);

        //Then
        assertFalse(validateSalaryRes);
    }
}
