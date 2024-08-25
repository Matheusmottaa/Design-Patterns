package model;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

}
