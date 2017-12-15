import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("String","Gibson", "Les Paul", 1800.04, 6);
    }

    @Test
    public void play() {
        assertEquals("thring", guitar.play("thring"));
    }

    @Test
    public void canCalculateMarkup() {
        guitar.calculateMarkup(0.1);
        assertEquals(1980.05, guitar.getPrice(), 0.05);
    }

}

