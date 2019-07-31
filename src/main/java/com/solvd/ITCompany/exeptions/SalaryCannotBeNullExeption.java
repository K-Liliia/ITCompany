package com.solvd.ITCompany.exeptions;

import java.io.IOException;

public class SalaryCannotBeNullExeption extends IOException {
    public SalaryCannotBeNullExeption(String message) {
        super(message);
    }
}
