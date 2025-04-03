package com;
public class DivideByZero {
    public static int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
