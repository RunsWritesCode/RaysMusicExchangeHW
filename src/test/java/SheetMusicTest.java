import Miscellaneous.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Igor Stravinsky", "The Firebird (L'oiseau de feu)", "Db minor", 27.20);
    }

    @Test
    public void canCalculateMarkup() {
        sheetMusic.calculateMarkup(0.1);
        assertEquals(29.92, sheetMusic.getPrice(), 0.05);
    }
}
