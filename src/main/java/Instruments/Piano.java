package Instruments;

//import ShopBusiness.ISell;

public class Piano extends Instrument implements IPlay {

    public String size;

    public Piano(String group, String make, String model, double price, String size) {
        super(group, make, model, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String play(String sound) {
        return "dudadader";
    }

}
