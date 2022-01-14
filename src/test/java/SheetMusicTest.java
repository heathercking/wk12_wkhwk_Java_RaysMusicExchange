import composer.Composer;
import instruments.Clarinet;
import instruments.ClassificationType;
import instruments.Instrument;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;
import products.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;
    Composer composer1;
    Composer composer2;
    Instrument clarinet;
    Instrument violin;


    @Before
    public void before() {
        composer1 = new Composer("Mozart", "Classical");
        composer2 = new Composer("Rachmaninov", "Romantic");
        clarinet = new Clarinet("Selmer", "CL211", "Intermediate", ClassificationType.WOODWIND, "BFlat", "Wood", "Felt");
        violin = new Violin("Stentor", "1018 Student", "Standard", ClassificationType.STRING, "4/4", "Helicore");
        sheetMusic = new SheetMusic("Clarinet Concerto", "Bla bla bla", clarinet, 5.00, 10.00, composer1, "Edition Peters");
    }

    @Test
    public void hasName() {
        assertEquals("Clarinet Concerto", sheetMusic.getName());
    }

    @Test
    public void canSetName() {
        sheetMusic.setName("Clarinet Sonata");
        assertEquals("Clarinet Sonata", sheetMusic.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("Bla bla bla", sheetMusic.getDescription());
    }

    @Test
    public void canSetDescription() {
        sheetMusic.setDescription("Something in here");
        assertEquals("Something in here", sheetMusic.getDescription());
    }

    @Test
    public void hasInstrument() {
        assertEquals(clarinet, sheetMusic.getInstrument());
    }

    @Test
    public void canSetInstrument() {
        sheetMusic.setInstrument(violin);
        assertEquals(violin, sheetMusic.getInstrument());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(5.00, sheetMusic.getPurchasePrice(), 0.0);
    }

    @Test
    public void canSetPurchasePrice() {
        sheetMusic.setPurchasePrice(10.00);
        assertEquals(10.00, sheetMusic.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(10.00, sheetMusic.getSalePrice(), 0.0);
    }

    @Test
    public void canSetSalePrice() {
        sheetMusic.setSalePrice(20.00);
        assertEquals(20.00, sheetMusic.getSalePrice(), 0.0);
    }
}
