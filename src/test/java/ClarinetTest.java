import instruments.Clarinet;
import instruments.ClassificationType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet("Selmer", "CL211", "Intermediate", ClassificationType.WOODWIND, 1000.00, 2000.00, "BFlat", "Wood", "Felt");
    }

    @Test
    public void hasBrand() {
        assertEquals("Selmer", clarinet.getBrand());
    }

    @Test
    public void canSetBrand() {
        clarinet.setBrand("Yamaha");
        assertEquals("Yamaha", clarinet.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("CL211", clarinet.getModel());
    }

    @Test
    public void canSetModel() {
        clarinet.setModel("CL111");
        assertEquals("CL111", clarinet.getModel());
    }

    @Test
    public void hasRange() {
        assertEquals("Intermediate", clarinet.getRange());
    }

    @Test
    public void canSetRange() {
        clarinet.setRange("Beginner");
        assertEquals("Beginner", clarinet.getRange());
    }

    @Test
    public void hasClassification() {
        assertEquals(ClassificationType.WOODWIND, clarinet.getClassification());
    }

    @Test
    public void canSetClassification() {
        clarinet.setClassification(ClassificationType.BRASS);
        assertEquals(ClassificationType.BRASS, clarinet.getClassification());
    }

    @Test
    public void hasKey() {
        assertEquals("BFlat", clarinet.getKey());
    }

    @Test
    public void canSetKey() {
        clarinet.setKey("A");
        assertEquals("A", clarinet.getKey());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", clarinet.getMaterial());
    }

    @Test
    public void canSetMaterial() {
        clarinet.setMaterial("Plastic");
        assertEquals("Plastic", clarinet.getMaterial());
    }

    @Test
    public void hasKeyPads() {
        assertEquals("Felt", clarinet.getKeyPads());
    }

    @Test
    public void canSetKeyPads() {
        clarinet.setKeyPads("Leather");
        assertEquals("Leather", clarinet.getKeyPads());
    }

    @Test
    public void canPlay() {
        assertEquals("toot toot!", clarinet.play());
    }


}
