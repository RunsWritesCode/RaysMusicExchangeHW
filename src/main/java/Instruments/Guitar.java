package Instruments;
import ShopBusiness.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    public int numberOfStrings;

    public Guitar(String group, String make, String model, double price, int numberOfStrings) {
        super(group, make, model, price);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


    @Override
    public String play(String sound) {
        return "thring";
    }

    @Override
    public void calculateMarkup(double markup) {
        this.price = this.price + (this.price * markup);
    }

}
