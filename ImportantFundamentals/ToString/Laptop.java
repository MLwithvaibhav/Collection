package ImportantFundamentals.ToString;

public class Laptop {
    String model;
        int price;
    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{model='" + model + "', price=" + price + "}";
    }
}
