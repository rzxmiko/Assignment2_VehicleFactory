package com.aitu.vehicle;
import com.aitu.vehicle.abstract_factory.Engine;
import com.aitu.vehicle.abstract_factory.SafetyFeature;
public class Main {
    public static void main(String[] args) {
        System.out.println("Part A: Factory Method");

        com.aitu.vehicle.factory_method.VehicleFactory bikeMethodFactory = new com.aitu.vehicle.factory_method.TwoWheelerFactory();
        bikeMethodFactory.deliverVehicle();

        com.aitu.vehicle.factory_method.VehicleFactory carMethodFactory = new com.aitu.vehicle.factory_method.FourWheelerFactory();
        carMethodFactory.deliverVehicle();

        System.out.println("Part B: Factory Method");

        System.out.println("Two-Wheeler Family");
        com.aitu.vehicle.abstract_factory.VehicleFactory bikeAbstractFactory = new com.aitu.vehicle.abstract_factory.TwoWheelerFactory();
        Engine bikeEngine = bikeAbstractFactory.createEngine();
        SafetyFeature bikeSafety = bikeAbstractFactory.createSafetyFeature();
        bikeEngine.getSpecs();
        bikeSafety.deploy();

        System.out.println();

        System.out.println("Four-Wheeler Family");
        com.aitu.vehicle.abstract_factory.VehicleFactory carAbstractFactory = new com.aitu.vehicle.abstract_factory.FourWheelerFactory();
        Engine carEngine = carAbstractFactory.createEngine();
        SafetyFeature carSafety = carAbstractFactory.createSafetyFeature();
        carEngine.getSpecs();
        carSafety.deploy();
    }
}