package com.solvd.ITCompany.ljambdaFunctions;

@FunctionalInterface
public interface IConvert<F, T> {
    T convert(F from);
}
