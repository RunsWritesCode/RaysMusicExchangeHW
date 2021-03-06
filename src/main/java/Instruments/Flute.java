package Instruments;

import ShopBusiness.ISell;


public class Flute extends Instrument implements IPlay, ISell {

    public String plating;

    public Flute(String group, String make, String model, double price, String plating) {
        super(group, make, model, price);
        this.plating = plating;
    }

    public String getPlating() {
        return plating;
    }

    public void setPlating(String plating) {
        this.plating = plating;
    }

    @Override
    public String play(String sound) {
        return "trill";
    }

    @Override
    public void calculateMarkup(double markup) {
        this.price = this.price + (this.price * markup);
    }

}
