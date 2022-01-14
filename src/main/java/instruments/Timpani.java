package instruments;

public class Timpani extends Instrument {

    private int size;

    public Timpani(String brand, String model, String range, ClassificationType classification, int size) {
        super(brand, model, range, classification);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String play() {
        return "bang bang!";
    }
}
