package a入门_策略模式;

import a入门_策略模式.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
