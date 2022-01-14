package instruments;

public class Instrument implements IPlay {

    private String name;
    private String brand;
    private String model;
    private String range;

    public Instrument(String name, String brand, String model, String range) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String play() {
        return null;
    }
}
