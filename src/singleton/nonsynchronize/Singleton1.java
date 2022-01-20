package singleton.nonsynchronize;

public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (null == singleton1) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
