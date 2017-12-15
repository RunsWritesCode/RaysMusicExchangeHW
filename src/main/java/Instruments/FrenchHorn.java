package Instruments;
//import ShopBusiness.ISell;

public class FrenchHorn extends Instrument implements IPlay {

    public int numberOfValves;

    public FrenchHorn(String group, String make, String model, double price, int numberOfValves) {
        super(group, make, model, price);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play(String sound) {
        return "paruump";
    }

}
