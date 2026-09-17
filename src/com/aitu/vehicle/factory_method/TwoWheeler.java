package com.aitu.vehicle.factory_method;

public class TwoWheeler implements Vehicle{
    @Override
    public void assemble(){
        System.out.println("Assembling a Two-Wheeler Vehicle(Motorcycle).");
    }
}
