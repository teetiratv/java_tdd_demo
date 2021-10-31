package com.example.demo;

import java.util.Objects;

public class Salary {
    public Boolean validateSalary(Double salary) {
        if (Objects.isNull(salary)) {
            return false;
        } else if (15000.00 < salary) {
            return true;
        }
        return false;
    }
}
