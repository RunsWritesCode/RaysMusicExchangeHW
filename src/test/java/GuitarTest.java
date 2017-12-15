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

}

