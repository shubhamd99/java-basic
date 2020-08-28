package com.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        File file = new File("/Users/shubhamdhage/learning/java/file/BikeInfo.txt");
        fileWriterDemo.WriteToFile(file);

    }

    private void WriteToFile(File fileToWrite) throws IOException {
        FileWriter bikeInfo = new FileWriter(fileToWrite);
        bikeInfo.write("Ducati");
        bikeInfo.close();
    }
}
