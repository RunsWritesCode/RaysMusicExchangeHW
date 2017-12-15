
import Miscellaneous.Plectrum;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlectrumTest {

    Plectrum plectrum;

    @Before
    public void before() {
        plectrum = new Plectrum("wood", "Manics", 4, 9.99);
    }

    @Test
    public void canCalculateMarkup() {
        plectrum.calculateMarkup(0.1);
        assertEquals(10.99, plectrum.getPrice(), 0.05);
    }
}
