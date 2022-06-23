package lesson5.prob2;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setQuackBehavior(new Squeak());
        setFlyBehavior(new CannotFly());
    }

    @Override
    public void display() {
        System.out.println("\tdisplaying");

    }
}
