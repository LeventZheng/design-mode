package c装饰者模式;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();  // cost方法必须在子类中实现
}
