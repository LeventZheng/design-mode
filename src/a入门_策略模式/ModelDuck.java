package a入门_策略模式;

import a入门_策略模式.fly.FlyNoWay;
import a入门_策略模式.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a modal duck");
    }

}
