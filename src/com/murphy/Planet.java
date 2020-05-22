package com.murphy;

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellites(HeavenlyBody moon) {
        if(this.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellites(moon);
        } else {
            return false;
        }
    }
}
