package e抽象工厂模式;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("纽约芝士比萨");
        } else if (item.equals("veggie")) {
//            pizza = new Veggi
        }
        return pizza;
    }
}
