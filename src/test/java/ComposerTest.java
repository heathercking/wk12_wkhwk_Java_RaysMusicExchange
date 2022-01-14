import composer.Composer;
import instruments.Clarinet;
import instruments.ClassificationType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;
import products.SheetMusic;

import static org.junit.Assert.assertEquals;

public class ComposerTest {

    Composer composer;
    SheetMusic sheetMusic;
    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet("Selmer", "CL211", "Intermediate", ClassificationType.WOODWIND, 1000.00, 2000.00, "BFlat", "Wood", "Felt");
        composer = new Composer("Mozart", "Classical");
        sheetMusic = new SheetMusic("Clarinet Concerto", "Bla bla bla", clarinet, 5.00, 10.00, composer, "Edition Peters");
    }

    @Test
    public void hasName() {
        assertEquals("Mozart", composer.getName());
    }

    @Test
    public void canSetName() {
        composer.setName("Rachmaninov");
        assertEquals("Rachmaninov", composer.getName());
    }

    @Test
    public void hasGenre() {
        assertEquals("Classical", composer.getGenre());
    }

    @Test
    public void canSetGenre() {
        composer.setGenre("Romantic");
        assertEquals("Romantic", composer.getGenre());
    }

    @Test
    public void canAddSheetMusicToCompositions() {
        composer.addComposition(sheetMusic);
        assertEquals(1, composer.compositionsCount());
    }

    @Test
    public void canRemoveSheetMusicFromCompositions() {
        composer.addComposition(sheetMusic);
        composer.removeComposition(sheetMusic);
        assertEquals(0, composer.compositionsCount());
    }


}
