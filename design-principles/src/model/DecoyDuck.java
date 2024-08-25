package model;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;
import model.duckBehaviors.FlyNoWay;

public class DecoyDuck extends Duck{

    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) throws IllegalArgumentException {
        if(!(flyBehavior instanceof FlyNoWay)) {
            throw new IllegalArgumentException("Your duck cannot fly");
        }
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Decoy duck");
    }
}
