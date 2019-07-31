package com.solvd.ITCompany.exeptions;

import org.apache.log4j.Logger;

public class MyExeption {
    private static final Logger logger = Logger.getLogger(MyExeption.class);

    public static void meaningful() throws SalaryCannotBeNullExeption {
        int salary = 0;

        if (salary == 0) {
            throw new SalaryCannotBeNullExeption("SalaryCannotBeNullExeption");
        } else {

            logger.info("Current salary= " + salary);
        }

    }

    public static void moneyPerDay() throws ReceivingMoneyExeption {
        double money = 500;
        double days = -5;

        if (days <= 0) {
            throw new ReceivingMoneyExeption("ReceivingMoneyExeption");
        } else {
            double rez = money / days;
            logger.info("result: " + rez);
        }
    }

    public static void main(String[] args) throws SalaryCannotBeNullExeption, ReceivingMoneyExeption {

        MyExeption.meaningful();
        MyExeption.moneyPerDay();
    }

}
