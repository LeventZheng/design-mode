package c装饰者模式;

public abstract class Condiment extends Beverage {  // 让 Condiment Decorator能够取代Beverage所以要用继承
    public abstract String getDescription();        // 所有地装饰者都必须重新实现getDescription方法
}
