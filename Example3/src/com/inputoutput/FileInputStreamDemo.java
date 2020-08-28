package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
        fileInputStreamDemo.readFromFile("/Users/shubhamdhage/learning/java/file/Message.txt");
    }

    private void readFromFile(String fileToRead) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileToRead);
        int integerReadFromFile;
        while((integerReadFromFile = inputStream.read()) != -1) {
            System.out.println("Characters " + (char)integerReadFromFile);
        }

        inputStream.close();
    }
}
