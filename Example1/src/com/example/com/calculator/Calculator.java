package com.example.com.calculator;

public class Calculator {
    // Constructor
    Calculator() {

    }
    // Non Static
    private Integer add(Integer arg1, Integer arg2) {
        Integer result = arg1 + arg2;
        return result;
    }

    // Same method name but different args
    private Integer add(Integer arg1, Integer arg2, Integer arg3) {
        Integer result = arg1 + arg2 + arg3;
        return result;
    }

    // A Java both int and Integer are used to store integer type data,
    // the major difference between both is type of int is primitive while Integer is of class type.
    // Integer is a wrapper class which wraps a primitive type int into an object.
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int arg1 = 10;
        int arg2 = 60;
        Integer result = cal.add(arg1, arg2);
        System.out.println("Result of addition: " + result);

        Integer result2 = cal.add(arg1, arg2, 100);
        System.out.println("Result of addition: " + result2);
    }
}
