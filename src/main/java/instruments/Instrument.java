package instruments;

import shop.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String brand;
    private String model;
    private String range;
    private ClassificationType classification;
    private double purchasePrice;
    private double salePrice;

    public Instrument(String brand, String model, String range, ClassificationType classification, double purchasePrice, double salePrice) {
        this.brand = brand;
        this.model = model;
        this.range = range;
        this.classification = classification;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public ClassificationType getClassification() {
        return classification;
    }

    public void setClassification(ClassificationType classification) {
        this.classification = classification;
    }

    public abstract String play();

    public double calculateMarkup() {
        return this.salePrice - this.purchasePrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

}
