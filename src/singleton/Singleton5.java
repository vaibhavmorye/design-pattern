package singleton;

public class Singleton5 { // class loader will create blueprint of this class once

    private Singleton5() {
    }

    public static final class SingletonHolder { // during this this inner class will be created as it is static instance
        // and it will be executed once and it will create instance of class
        public static Singleton5 singleton5 = new Singleton5();
    }

    public static void main(String[] args) {
        Runtime.getRuntime();
    }
    public static Singleton5 getInstance() {
        return SingletonHolder.singleton5;
    }
}
