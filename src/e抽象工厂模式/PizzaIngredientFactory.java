package e抽象工厂模式;

import e抽象工厂模式.原料.Cheese;
import e抽象工厂模式.原料.Clams;
import e抽象工厂模式.原料.Dough;
import e抽象工厂模式.原料.Sauce;

public class PizzaIngredientFactory {

    public Dough createDough() {
        return new Dough();
    }

    public Sauce createSauce() {
        return new Sauce();
    }

    public Cheese createCheese() {
        return new Cheese();
    }

    public Clams createClams() {
        return new Clams();
    }
}
