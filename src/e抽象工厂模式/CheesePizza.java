package e抽象工厂模式;

import e抽象工厂模式.原料.Cheese;
import e抽象工厂模式.原料.Dough;
import e抽象工厂模式.原料.Sauce;

// 芝士比萨
public class CheesePizza extends Pizza {
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    PizzaIngredientFactory ingredientFactory;
    
    // 要制作比萨，需要工厂提供原料。所以每个比萨类都需要从构造器参数中得到一个工厂，并把这个工厂存储在一个实例变量中
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    // prepare方法一步一步地创建芝士比萨，每当需要原料地时候，就跟工厂要
    void prepare() {
        System.out.println("Preparing " + name);
        // 神奇的事情发生在这里
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
