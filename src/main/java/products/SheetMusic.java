package products;

import composer.Composer;
import instruments.Instrument;

public class SheetMusic extends Product {

    private Composer composer;
    private String publisher;

    public SheetMusic(String name, String description, Instrument instrument, double purchasePrice, double salePrice, Composer composer, String publisher) {
        super(name, description, instrument, purchasePrice, salePrice);
        this.composer = composer;
        this.publisher = publisher;
    }

    public Composer getComposer() {
        return composer;
    }

    public void setComposer(Composer composer) {
        this.composer = composer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
