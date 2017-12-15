import Instruments.Flute;
import Instruments.IPlay;
import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute("woodwind", "Pearl", "Quantz Forza", 1023.44, "gold");
    }

    @Test
    public void play() {
        assertEquals("trill", flute.play("trill"));
    }


    @Test
    public void canGetPrice() {
        assertEquals(1023.44, flute.getPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        flute.calculateMarkup(0.1);
        assertEquals(1125.78, flute.getPrice(), 0.05);
    }
}
