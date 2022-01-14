package instruments;

public class Violin extends Instrument {

    private String size;
    private String stringMake;

    public Violin(String brand, String model, String range, ClassificationType classification, String size, String stringMake) {
        super(brand, model, range, classification);
        this.size = size;
        this.stringMake = stringMake;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStringMake() {
        return stringMake;
    }

    public void setStringMake(String stringMake) {
        this.stringMake = stringMake;
    }

    public String play() {
        return "squeek squeek!";
    }
}
