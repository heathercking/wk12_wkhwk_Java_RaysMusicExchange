package instruments;

public class Clarinet extends Instrument {

    private String key;
    private String material;
    private String keyPads;

    public Clarinet(String name, String brand, String model, String range, ClassificationType classification, String key, String material, String keyPads) {
        super(name, brand, model, range, classification);
        this.key = key;
        this.material = material;
        this.keyPads = keyPads;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKeyPads() {
        return keyPads;
    }

    public void setKeyPads(String keyPads) {
        this.keyPads = keyPads;
    }

    public String play() {
        return "toot toot!";
    }
    
}
