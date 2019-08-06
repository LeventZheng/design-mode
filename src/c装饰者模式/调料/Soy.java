package c装饰者模式.调料;

import c装饰者模式.Beverage;
import c装饰者模式.Condiment;

public class Soy extends Condiment {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
