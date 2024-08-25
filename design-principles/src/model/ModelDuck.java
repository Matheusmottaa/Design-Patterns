package model;

import model.duckBehaviors.FlyWithWings;
import model.duckBehaviors.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Just a model duck...");
    }
}
