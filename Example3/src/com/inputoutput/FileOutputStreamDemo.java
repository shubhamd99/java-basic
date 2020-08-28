package com.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/shubhamdhage/learning/java/file/Message.txt");
        FileOutputStreamDemo fileOutputStream = new FileOutputStreamDemo();
        fileOutputStream.writeToFile(file);

    }

    private void writeToFile(File fileToWrite) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileToWrite);
        fileOutputStream.write(":Hello Folks".getBytes());
        fileOutputStream.close();
    }
}
