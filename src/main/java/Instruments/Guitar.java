package Instruments;
//import ShopBusiness.ISell;

public class Guitar extends Instrument implements IPlay {

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
        return "chord";
    }
}
