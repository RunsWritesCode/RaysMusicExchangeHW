import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("percussion", "C. Bechstein", "Model A", 19000.00, "Grand");
    }

    @Test
    public void play() {
        assertEquals("dudadader", piano.play("dudadader"));
    }

    @Test
    public void canCalculateMarkup() {
        piano.calculateMarkup(0.1);
        assertEquals(20900.00, piano.getPrice(), 0.05);
    }
}
