package com.solvd.ITCompany.exeptions;

import java.io.IOException;

public class ReceivingMoneyExeption extends IOException {
    public ReceivingMoneyExeption(String message) {
        super(message);
    }
}
