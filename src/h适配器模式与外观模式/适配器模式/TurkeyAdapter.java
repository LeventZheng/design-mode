package h适配器模式与外观模式.适配器模式;

public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    };

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        this.turkey.fly();
    }
}
