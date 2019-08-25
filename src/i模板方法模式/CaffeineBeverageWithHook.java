package i模板方法模式;

public abstract class CaffeineBeverageWithHook {

    // 这是我们的模板方法
    // 某些方法由超类处理，有些方法由子类处理
    final void prepareRecipe() {
        boilWater();
        brew();
        pourIncup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 需要由子类处理的方法，必须在超类中声明为抽象
    abstract void brew();

    abstract void addCondiments();

    // 具体的方法可以定义为final，使得子类无法更改
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourIncup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
