package instruments;

import shop.ISell;

public class Clarinet extends Instrument {

    private String key;
    private String material;
    private String keyPads;

    public Clarinet(String brand, String model, String range, ClassificationType classification, double purchasePrice, double salePrice, String key, String material, String keyPads) {
        super(brand, model, range, classification, purchasePrice, salePrice);
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
