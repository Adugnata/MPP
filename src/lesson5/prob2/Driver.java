package lesson5.prob2;

public class Driver {

    public static void main(String[] args) {
        Duck[] ducks =
                {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
        for (Duck duck : ducks) {
            System.out.println(duck.getClass().getSimpleName() + ":");
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }

    }

}
