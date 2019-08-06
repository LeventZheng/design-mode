package c装饰者模式.调料;

import c装饰者模式.Beverage;
import c装饰者模式.Condiment;

public class Whip extends Condiment {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
