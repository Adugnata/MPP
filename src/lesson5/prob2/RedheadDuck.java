package lesson5.prob2;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("\tdisplaying");

    }
}
