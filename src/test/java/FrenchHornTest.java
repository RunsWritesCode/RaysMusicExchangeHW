import Instruments.FrenchHorn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrenchHornTest {

    FrenchHorn frenchHorn;

    @Before
    public void before() {
        frenchHorn = new FrenchHorn("brass", "Yamaha", "YHR-667", 4444.44, 4);

    }

    @Test
    public void play() {
        assertEquals("paruump", frenchHorn.play("paruump"));
    }


}
