package products;

import instruments.Instrument;
import shop.ISell;

public abstract class Product implements ISell {

    private String name;
    private String description;
    private Instrument instrument;
    private double purchasePrice;
    private double salePrice;

    public Product(String name, String description, Instrument instrument, double purchasePrice, double salePrice) {
        this.name = name;
        this.description = description;
        this.instrument = instrument;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double calculateMarkup() {
        return this.salePrice - this.purchasePrice;
    }
}
