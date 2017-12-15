package Miscellaneous;

import ShopBusiness.ISell;

public class Drumstick implements ISell {

    private String material;
    private double price;

    public Drumstick(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public void calculateMarkup(double markup) {
        this.price = this.price + (this.price * markup);
    }
}
