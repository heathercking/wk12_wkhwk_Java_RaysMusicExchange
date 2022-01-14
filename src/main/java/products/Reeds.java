package products;

import instruments.Instrument;

public class Reeds extends Product {

    private String strength;
    private String brand;

    public Reeds(String name, String description, Instrument instrument, double purchasePrice, double salePrice, String strength, String brand) {
        super(name, description, instrument, purchasePrice, salePrice);
        this.strength = strength;
        this.brand = brand;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
