package builder;

public class TestOrder {
    public static void main(final String[] args) {
        OrderManager manager = new OrderManager();
        manager.createOrder("porshe","cayman","yellow",5100);
        manager.printOrder();
    }
}
