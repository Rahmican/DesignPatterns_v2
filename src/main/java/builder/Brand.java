package builder;

public class Brand {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Brand(final  String brand){
        setBrand(brand);
    }

    @Override
    public String toString() {
        return brand;
    }
}
