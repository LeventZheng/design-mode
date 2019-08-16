package e抽象工厂模式;

import e抽象工厂模式.原料.*;

public abstract class Pizza {
    // 原料
    String name;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    // 只有prepare方法需要改变
    abstract void prepare();

    void bake() {
        System.out.println("以350度烘培25分钟");
    }

    void cut() {
        System.out.println("把披萨切成小份");
    }

    void box() {
        System.out.println("把披萨放进披萨店专用盒子里");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        // 打印比萨的代码
        return "";
    }
}
