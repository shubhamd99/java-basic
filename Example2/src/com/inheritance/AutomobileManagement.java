package com.inheritance;

public class AutomobileManagement {
    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.numberOfWheels = 4;

        Bike honda = new Bike();
        // honda.numberOfWheels = 2;

        mercedes.move();
        honda.printNumberOfWheels();

        // Polymorphism
        Vehicle vehicle1 = mercedes;
        Vehicle vehicle2 = new Vehicle();
        vehicle1.move();
        vehicle2.move();
    }
}
