package builder;

public class OrderManager {
    private OrderBuilder builder;
    public Car createOrder(final String brand, final String model, final String color, final int power){
        if(brand == "porshe"){
            builder = new PorsheBuilder();
        }

        builder.setBrand(brand);
        builder.setModel(model);
        builder.setColor(color);
        builder.setPower(power);

        return builder.getCar();
    }

    public void printOrder(){
        System.out.println("Brand : "+ builder.getCar().getBrand());
        System.out.println("Model : "+ builder.getCar().getModel());
        System.out.println("Color : "+ builder.getCar().getColor());
        System.out.println("Power : "+ builder.getCar().getPower());
    }
}
