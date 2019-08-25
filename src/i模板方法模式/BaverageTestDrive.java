package i模板方法模式;

public class BaverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nmaking coffee");
        coffeeWithHook.prepareRecipe();
    }
}
