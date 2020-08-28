package com.inputoutput;

import java.io.Serializable;

public class VehicleDemo implements Serializable {

    Integer numberOfWheels;
    Integer mileage;
    String nameOfVehicle;

    VehicleDemo(String nameOfVehicle, Integer numberOfWheels, Integer mileage) {
        this.nameOfVehicle = nameOfVehicle;
        this.mileage = mileage;
        this.numberOfWheels = numberOfWheels;
    }
}
