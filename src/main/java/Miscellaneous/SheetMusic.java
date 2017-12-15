package Miscellaneous;

import ShopBusiness.ISell;

public class SheetMusic implements ISell {

    private String composer;
    private String title;
    private String key;
    private double price;

    public SheetMusic(String composer, String title, String key, double price) {
        this.composer = composer;
        this.title = title;
        this.key = key;
        this.price = price;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
