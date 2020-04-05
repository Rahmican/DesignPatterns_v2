package builder;

public class PorsheBuilder extends OrderBuilder{

    public void setBrand(String brand) {
        getCar().setBrand(new Brand(brand));
    }

    public void setModel(String model) {
        getCar().setModel(new Model(model));
    }

    public void setColor(String color) {
        getCar().setColor(color);
    }

    public void setPower(int power) {
        getCar().setPower(power);
    }
}
