package com.solvd.ITCompany.ljambdaFunctions;

@FunctionalInterface
public interface IShowInfo {
    public String information(String str);

    default void message() {
        System.out.println("Test message");
    }
}
