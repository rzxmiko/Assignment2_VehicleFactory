package com.aitu.vehicle.abstract_factory;

public class Seabelt implements SafetyFeature{
    @Override
    public void deploy(){
        System.out.println("Safety: 3-points seabelt system enabled");
    }
}
