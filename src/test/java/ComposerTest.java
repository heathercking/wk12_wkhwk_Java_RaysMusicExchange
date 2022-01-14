import composer.Composer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComposerTest {

    Composer composer;

    @Before
    public void before() {
        composer = new Composer("Mozart", "Classical");
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


}
