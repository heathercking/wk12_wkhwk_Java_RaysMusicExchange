import composer.Composer;
import instruments.Clarinet;
import instruments.ClassificationType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;
import products.InstrumentAccessory;
import products.Reeds;
import products.SheetMusic;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Clarinet clarinet;
    Violin violin;
    SheetMusic sheetMusic;
    Reeds reeds;
    Composer composer;
    InstrumentAccessory accessory;

    @Before
    public void before() {
        shop = new Shop();
        composer = new Composer("Mozart", "Classical");
        clarinet = new Clarinet("Selmer", "CL211", "Intermediate", ClassificationType.WOODWIND, 1000.00, 2000.00, "BFlat", "Wood", "Felt");
        violin = new Violin("Stentor", "1018 Student", "Standard", ClassificationType.STRING, 1000.00, 2000.00,"4/4", "Helicore");
        sheetMusic = new SheetMusic("Clarinet Concerto", "Bla bla bla", clarinet, 5.00, 10.00, composer, "Edition Peters");
        reeds = new Reeds("Rico Royal", "box of 10", clarinet, 15.00, 30.00, "3b", "Rico");
        accessory = new InstrumentAccessory("Clarinet stand", "suitable...", clarinet, 10.00, 20.00);
    }

    @Test
    public void canAddProductToStock() {
        shop.addProductToStock(clarinet);
        assertEquals(1, shop.getProductCount());
    }

    @Test
    public void canRemoveProductFromStock() {
        shop.addProductToStock(clarinet);
        shop.addProductToStock(violin);
        shop.addProductToStock(reeds);
        shop.removeProductFromStock(clarinet);
        assertEquals(2, shop.getProductCount());
    }
}
