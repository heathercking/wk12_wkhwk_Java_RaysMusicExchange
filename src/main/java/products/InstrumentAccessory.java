package products;

import instruments.Instrument;

public class InstrumentAccessory extends Product {

    public InstrumentAccessory(String name, String description, Instrument instrument, double purchasePrice, double salePrice) {
        super(name, description, instrument, purchasePrice, salePrice);
    }

}
