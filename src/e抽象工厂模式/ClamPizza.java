package e抽象工厂模式;

import e抽象工厂模式.原料.Cheese;
import e抽象工厂模式.原料.Clams;
import e抽象工厂模式.原料.Dough;
import e抽象工厂模式.原料.Sauce;

// 蛤蜊比萨
public class ClamPizza extends Pizza {
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;
    
    PizzaIngredientFactory ingredientFactory;
    
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    void prepare() {
        System.out.println("准备 " + name);
        // 要做出蛤蜊比萨，prepare就需要从本地工厂中取得正确的原料。
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        // 如果是纽约工厂，使用新鲜的蛤蜊；如果是芝加哥工厂，使用冰冻的蛤蜊
        clams = ingredientFactory.createClams();
    }
}
