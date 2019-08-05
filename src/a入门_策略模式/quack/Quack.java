package a入门_策略模式.quack;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
