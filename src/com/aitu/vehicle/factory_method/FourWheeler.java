package com.aitu.vehicle.factory_method;

public class FourWheeler implements Vehicle{
    @Override
    public void assemble() {
        System.out.println("Assembling a Four-Wheeler Vehicle(Car).");
    }
}
