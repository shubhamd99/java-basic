package com.example;
// Class
public class HelloWorld {
    private Integer instanceVariable = 10;
    static Integer instanceVariableStatic = 10;

    // Non-Static Method
    private void nonStaticTest() {
        System.out.println("Non-Static Method");
    }

    // Static Method
    private static void staticTest() {
        System.out.println("Static Method");
    }

    // Used for threads
    private synchronized void syncMethod() {
        Integer localVariable = 30;
    }

    // Main represents startup of the program
    public static void main(String[] args) {
        System.out.println("HelloWord");

        // Non Static method needs object for calling it
        // We cannot call it directly like test()
        HelloWorld helloWorldObject = new HelloWorld();
        helloWorldObject.nonStaticTest();
        helloWorldObject.syncMethod();

        // Static we can call it directly
        staticTest();

        HelloWorld.instanceVariableStatic = 20;
    }
}
