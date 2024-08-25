package model.duckBehaviors;

import interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Makes no sound");
    }
}
