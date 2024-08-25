import model.DecoyDuck;
import model.Duck;
import model.MallardDuck;
import model.ModelDuck;
import model.duckBehaviors.FlyNoWay;
import model.duckBehaviors.FlyRocketPowered;
import model.duckBehaviors.FlyWithWings;
import model.duckBehaviors.Quack;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck(new FlyWithWings(), new Quack());
        Duck decoyDuck = new DecoyDuck(new FlyNoWay(), new Quack());

        System.out.println("\n\n================= DUCK =================");
        duck.performFly();
        duck.performQuack();
        System.out.println("==============================================");

        System.out.println("\n\n================= DECOY DUCK =================");
        decoyDuck.performQuack();
        decoyDuck.performFly();
        System.out.println("==============================================");

        System.out.println("\n\n================= Model DUCK =================");
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        System.out.println("\nChanging the fly behavior");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        System.out.println("==============================================");
    }
}