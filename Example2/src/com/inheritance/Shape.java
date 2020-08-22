package com.inheritance;

// An abstract class is a class that is declared abstract —it may or may not include abstract methods.
// Abstract classes cannot be instantiated, but they can be subclassed.
public abstract class Shape {

    abstract float area();

    public void displayArea(float area) {
        System.out.println("Printing area of a shape: "+ area);
    }
}
