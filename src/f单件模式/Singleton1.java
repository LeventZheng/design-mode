package f单件模式;

public class Singleton1 {
    // volatile关键字确保：当uniqueInstance变量被初始化成Singleton1实例时，多个线程正确地处理uniqueInstance变量
    private volatile static Singleton1 uniqueInstance;
    private Singleton1() {}

    public static Singleton1 getInstance() {
        // 检查实例，如果不存在，就进入同步区块
        if (uniqueInstance == null) {
            // 只有第一次才彻底执行这里的代码
            synchronized (Singleton1.class) {
                if (uniqueInstance == null) {
                    // 进入区块后，再检查一次，如果仍是null,才创建实例
                    uniqueInstance = new Singleton1();
                }
            }
        }
        return uniqueInstance;
    }
}
