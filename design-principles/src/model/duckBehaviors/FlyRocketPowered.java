package model.duckBehaviors;

import interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("Flying with a rocket!!!");
    }
}
