package com.aitu.vehicle.abstract_factory;

public class Helmet implements SafetyFeature {
    @Override
    public void deploy() {
        System.out.println("Safety: Full-face protective helmet included");
    }
}
