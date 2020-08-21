package com.example.com.constructor;

public class Constructor {
    int instanceVariable;

    // Constructor chaining is the process of calling one constructor,
    // from another constructor with respect to current object.
    Constructor(int value) {
        this(value, 0); // Constructor Chaining
    }

    Constructor(int value1, int value2) {
        instanceVariable = value1 + value2;
    }

    public static void main(String[] args) {

    }
}
