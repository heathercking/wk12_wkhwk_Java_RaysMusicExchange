package shop;

import products.Reeds;

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

    public ArrayList<ISell> getStockList() {
        return this.stock;
    }

    public double calculateTotalPotentialProfit() {
        double total = 0;
        for (ISell product : this.stock) {
            total += product.calculateMarkup();
        }
        return total;
    }


    public double applyDiscount(ISell product, DiscountType discount) {
        return (product.getSalePrice() / 100) * discount.getDiscount();
    }
}
