import instruments.ClassificationType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Stentor", "1018 Student", "Standard", ClassificationType.STRING, 1000.00, 2000.00,"4/4", "Helicore");
    }

    @Test
    public void hasBrand() {
        assertEquals("Stentor", violin.getBrand());
    }

    @Test
    public void canSetBrand() {
        violin.setBrand("Yamaha");
        assertEquals("Yamaha", violin.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("1018 Student", violin.getModel());
    }

    @Test
    public void canSetModel() {
        violin.setModel("CL111");
        assertEquals("CL111", violin.getModel());
    }

    @Test
    public void hasRange() {
        assertEquals("Standard", violin.getRange());
    }

    @Test
    public void canSetRange() {
        violin.setRange("Beginner");
        assertEquals("Beginner", violin.getRange());
    }

    @Test
    public void hasClassification() {
        assertEquals(ClassificationType.STRING, violin.getClassification());
    }

    @Test
    public void canSetClassification() {
        violin.setClassification(ClassificationType.BRASS);
        assertEquals(ClassificationType.BRASS, violin.getClassification());
    }

    @Test
    public void hasSize() {
        assertEquals("4/4", violin.getSize());
    }

    @Test
    public void canSetSize() {
        violin.setSize("1/4");
        assertEquals("1/4", violin.getSize());
    }

    @Test
    public void hasStringMake() {
        assertEquals("Helicore", violin.getStringMake());
    }

    @Test
    public void canSetStringMake() {
        violin.setStringMake("Pirastro");
        assertEquals("Pirastro", violin.getStringMake());
    }

    @Test
    public void canPlay() {
        assertEquals("squeek squeek!", violin.play());
    }

}
