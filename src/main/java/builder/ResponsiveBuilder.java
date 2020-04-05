package builder;

public class ResponsiveBuilder {

    private Brand brand;
    private Model model;
    private int power;
    private String color;

    public static ResponsiveBuilder startBuilding(){
        return new ResponsiveBuilder();
    }

    public ResponsiveBuilder withBrand(final Brand brand){
        this.brand = brand;
        return this;
    }

    public ResponsiveBuilder withModel(final Model model){
        this.model = model;
        return this;
    }

    public ResponsiveBuilder withPower(final int power){
        this.power = power;
        return this;
    }

    public ResponsiveBuilder withColor(final String color){
        this.color = color;
        return this;
    }

    public Car build(){
        final Car car = new Car();
        car.setBrand(brand);
        car.setColor(color);
        car.setModel(model);
        car.setPower(power);
        return car;
    }


    public static void main(final String[] args) {
       ResponsiveBuilder.startBuilding()
               .withBrand(new Brand("Porshe"))
               .withModel(new Model("cayman"))
               .withColor("Black")
               .withPower(5100).build();



    }

}
