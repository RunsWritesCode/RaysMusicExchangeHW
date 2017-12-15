package ShopBusiness;

import Instruments.Flute;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();

    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }


    public int stockCount() {
        return this.stock.size();
    }

    public void addItemToStock(ISell instrument) {
        this.stock.add(instrument);
    }



}
