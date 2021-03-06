package Miscellaneous;

import ShopBusiness.ISell;

public class Plectrum implements ISell {

    private String material;
    private String logo;
    private int numInPack;
    private double price;

    public Plectrum(String material, String logo, int numInPack, double price) {
        this.material = material;
        this.logo = logo;
        this.numInPack = numInPack;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getNumInPack() {
        return numInPack;
    }

    public void setNumInPack(int numInPack) {
        this.numInPack = numInPack;
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
