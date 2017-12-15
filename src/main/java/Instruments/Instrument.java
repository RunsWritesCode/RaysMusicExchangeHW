package Instruments;

public abstract class Instrument {

public String group;
public String make;
public String model;
public double price;

    public Instrument(String group, String make, String model, double price) {
        this.group = group;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
