package com.inputoutput;

import java.io.*;

public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        VehicleDemo bmw = new VehicleDemo("190x", 2, 100);
        File serializedFile = new File("/Users/shubhamdhage/learning/java/file/serializedFile.bin");
        new ObjectOutputStreamDemo().serialize(serializedFile, bmw);

        new ObjectOutputStreamDemo().deserialize(serializedFile);
    }

    private void serialize(File file, VehicleDemo instanceOfVehicleDemo) throws IOException {
        FileOutputStream fileStream = new FileOutputStream(file);
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(instanceOfVehicleDemo);
        objectStream.flush();
        objectStream.close();
    }

    private void deserialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        // (VehicleDemo) --> Type Casted
        VehicleDemo deserializedObject = (VehicleDemo) objectStream.readObject();
        System.out.println("Name: " + deserializedObject.nameOfVehicle);
        System.out.println("Wheels: " + deserializedObject.numberOfWheels);
    }
}
