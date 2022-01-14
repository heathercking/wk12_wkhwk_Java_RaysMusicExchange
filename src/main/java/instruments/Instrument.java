package instruments;

public abstract class Instrument implements IPlay {

    private String brand;
    private String model;
    private String range;
    private ClassificationType classification;

    public Instrument(String brand, String model, String range, ClassificationType classification) {
        this.brand = brand;
        this.model = model;
        this.range = range;
        this.classification = classification;
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

}
