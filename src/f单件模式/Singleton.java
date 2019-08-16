package f单件模式;

public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() {}

    // 通过增加synchronized关键字到getInstance方法中，我们迫使每个线程进入这个方法前，要先等候别的线程离开该方法。也就是说，不会有两个线程可以同时进入这个方法
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
