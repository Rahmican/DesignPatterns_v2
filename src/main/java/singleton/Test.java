package singleton;

public class Test {
    public static void main(final String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton.instance().printThis();
        }
    }

}
