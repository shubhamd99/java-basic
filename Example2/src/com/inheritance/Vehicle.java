package com.inheritance;

// public final class Vehicle { // Cannot extendable, we cannot override final class/methods
public class Vehicle {
    Integer numberOfWheels;
    Long mileage;

    // Constructor
    Vehicle() {
        System.out.println("This is Vehicle Constructor");
    }

    // public final void move() {
    public void move() {
        System.out.println("Move in vehicle");
    }
}
