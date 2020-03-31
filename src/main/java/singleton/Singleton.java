package singleton;

public class Singleton {


    private static volatile Singleton instance = null;

    private static Object lock = new Object();

    private Singleton() {
        System.out.println("Singleton Başlatılıyor ...");
    }


    public static Singleton instance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printThis() {
        System.out.println(this);
    }
}