package com.inheritance;

public class Bike extends Vehicle {

    @Override
    public void move() {
        System.out.println("Move in Bike");
    }

    // Super
    public void printNumberOfWheels() {
        numberOfWheels = 6;
        System.out.println("Non-Super: " + numberOfWheels);
        System.out.println("Super: " + super.numberOfWheels);
    }
}
