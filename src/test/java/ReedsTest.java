import instruments.Clarinet;
import instruments.ClassificationType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;
import products.Reeds;

import static org.junit.Assert.assertEquals;

public class ReedsTest {

    Reeds reeds;
    Clarinet clarinet;
    Violin violin;

    @Before
    public void before() {
        clarinet = new Clarinet("Selmer", "CL211", "Intermediate", ClassificationType.WOODWIND, "BFlat", "Wood", "Felt");
        violin = new Violin("Stentor", "1018 Student", "Standard", ClassificationType.STRING, "4/4", "Helicore");
        reeds = new Reeds("Rico Royal", "box of 10", clarinet, 15.00, 30.00, "3b", "Rico");
    }

    @Test
    public void hasName() {
        assertEquals("Rico Royal", reeds.getName());
    }

    @Test
    public void canSetName() {
        reeds.setName("Vandoren");
        assertEquals("Vandoren", reeds.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("box of 10", reeds.getDescription());
    }

    @Test
    public void canSetDescription() {
        reeds.setDescription("box of 5");
        assertEquals("box of 5", reeds.getDescription());
    }

    @Test
    public void hasInstrument() {
        assertEquals(clarinet, reeds.getInstrument());
    }

    @Test
    public void canSetInstrument() {
        reeds.setInstrument(violin);
        assertEquals(violin, reeds.getInstrument());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(15.00, reeds.getPurchasePrice(), 0.0);
    }

    @Test
    public void canSetPurchasePrice() {
        reeds.setPurchasePrice(10.00);
        assertEquals(10.00, reeds.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(30.00, reeds.getSalePrice(), 0.0);
    }

    @Test
    public void canSetSalePrice() {
        reeds.setSalePrice(20.00);
        assertEquals(20.00, reeds.getSalePrice(), 0.0);
    }

    @Test
    public void hasStrength() {
        assertEquals("3b", reeds.getStrength());
    }

    @Test
    public void canSetStrength() {
        reeds.setStrength("2a");
        assertEquals("2a", reeds.getStrength());
    }

    @Test
    public void hasBrand() {
        assertEquals("Rico", reeds.getBrand());
    }

    @Test
    public void canSetBrand() {
        reeds.setBrand("Vandoren");
        assertEquals("Vandoren", reeds.getBrand());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(15.00, reeds.calculateMarkup(), 0.0);
    }
}
