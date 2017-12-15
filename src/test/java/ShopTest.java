import Instruments.Flute;
import Instruments.Guitar;
import Instruments.Piano;
import Miscellaneous.Plectrum;
import Miscellaneous.SheetMusic;
import ShopBusiness.ISell;
import ShopBusiness.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Flute flute;
    Piano piano;
    SheetMusic sheetMusic;
    Plectrum plectrum;
    Guitar guitar;


    @Before
        public void before() {
            shop = new Shop();
            flute = new Flute("woodwind", "Pearl", "Quantz Forza", 1023.44, "gold");
            plectrum = new Plectrum("wood", "Manics", 4, 9.99);
            guitar = new Guitar("String","Gibson", "Les Paul", 1800.04, 6);
    }

    @Test
    public void stockCountStartsAtZero() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(flute);
        assertEquals(1, shop.stockCount());
    }
}
