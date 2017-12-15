import Miscellaneous.Drumstick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumstick drumstick;

    @Before
    public void before() {
        drumstick = new Drumstick("wood", 12.99);
    }

    @Test
    public void canCalculateMarkup() {
        drumstick.calculateMarkup(0.1);
        assertEquals(14.289, drumstick.getPrice(), 0.05);
    }


}
