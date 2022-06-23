package lesson5.prob2;

abstract public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    abstract public void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    protected void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("\tswimming");
    }

}
