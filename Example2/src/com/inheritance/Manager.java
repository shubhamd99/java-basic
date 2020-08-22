package com.inheritance;

public class Manager {
    long salary;

    public void display(Integer dummyValueToBePrinted) {
        System.out.println("Printing integer value" + dummyValueToBePrinted);
    }

    public void display(String dummyValueToBePrinted) {
        System.out.println("Printing string value" + dummyValueToBePrinted);
    }

    public static void main(String[] args) {
        Manager seniorManagerGrade2 = new Manager();
        seniorManagerGrade2.display(100);
        seniorManagerGrade2.display("Shubham");
    }
}
