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
}
