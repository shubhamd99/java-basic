package com.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        File file = new File("/Users/shubhamdhage/learning/java/file/EmployeeInfo.txt");

        InputOutputDemo demo = new InputOutputDemo();
        demo.writeToFile(file);

        try {
            demo.readFile(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(File fileToWrite) {
        PrintWriter employeeInfoWriter = null;
        try {
            employeeInfoWriter = new PrintWriter(fileToWrite);
            employeeInfoWriter.println("SHubham DHage");
            employeeInfoWriter.println("100");
        } catch (FileNotFoundException error) {
            System.out.println("File Not Found: " + fileToWrite.getName());
            throw new RuntimeException(error);
        } finally {
            // Closing the resources
            employeeInfoWriter.close();
        }
    }

    private void readFile(File fileToRead) throws FileNotFoundException {
        Scanner input = new Scanner(fileToRead);
        while (input.hasNext()) {
            System.out.println("Read --> " + input.nextLine());
        }
    }
}
