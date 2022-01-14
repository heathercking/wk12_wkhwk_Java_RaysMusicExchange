package shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addProductToStock(ISell product) {
        this.stock.add(product);
    }

    public void removeProductFromStock(ISell product) {
        this.stock.remove(product);
    }

    public int getProductCount() {
        return this.stock.size();
    }
}
