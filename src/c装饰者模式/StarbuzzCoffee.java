package c装饰者模式;

import c装饰者模式.调料.Mocha;
import c装饰者模式.调料.Whip;
import c装饰者模式.饮料.Espresso;
import c装饰者模式.饮料.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
