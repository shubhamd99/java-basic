package com.inheritance;

public class Employee extends Manager {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = 1000;
        System.out.println("Salary: " + emp.salary);
    }
}
