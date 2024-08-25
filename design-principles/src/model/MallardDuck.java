package model;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;
import model.duckBehaviors.FlyWithWings;
import model.duckBehaviors.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Real Mallard Duck!");
    }

}
