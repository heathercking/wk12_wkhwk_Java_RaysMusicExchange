import instruments.ClassificationType;
import instruments.Timpani;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimpaniTest {

    Timpani timpani;

    @Before
    public void before() {
        timpani = new Timpani("Adams", "TP123", "Beginner", ClassificationType.PERCUSSION, 2000.00, 4000.00, 32);
    }

    @Test
    public void hasBrand() {
        assertEquals("Adams", timpani.getBrand());
    }

    @Test
    public void canSetBrand() {
        timpani.setBrand("Yamaha");
        assertEquals("Yamaha", timpani.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("TP123", timpani.getModel());
    }

    @Test
    public void canSetModel() {
        timpani.setModel("CL111");
        assertEquals("CL111", timpani.getModel());
    }

    @Test
    public void hasRange() {
        assertEquals("Beginner", timpani.getRange());
    }

    @Test
    public void canSetRange() {
        timpani.setRange("Intermediate");
        assertEquals("Intermediate", timpani.getRange());
    }

    @Test
    public void hasClassification() {
        assertEquals(ClassificationType.PERCUSSION, timpani.getClassification());
    }

    @Test
    public void canSetClassification() {
        timpani.setClassification(ClassificationType.BRASS);
        assertEquals(ClassificationType.BRASS, timpani.getClassification());
    }

    @Test
    public void hasSize() {
        assertEquals(32, timpani.getSize());
    }

    @Test
    public void canSetSize() {
        timpani.setSize(29);
        assertEquals(29, timpani.getSize());
    }

    @Test
    public void canPlay() {
        assertEquals("bang bang!", timpani.play());
    }
}
