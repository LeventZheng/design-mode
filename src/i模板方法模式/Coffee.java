package i模板方法模式;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Caffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
