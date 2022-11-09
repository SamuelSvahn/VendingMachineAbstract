package model;

public class Soda extends Product{

    //fields
    private String flavour;

    public Soda(int id, double price, String productName, String flavour) {
        super(id, price, productName);
        setFlavour(flavour);
    }

    public String examine() {
        return null;
    }

    public String use() {
        return null;
    }


    // setters and getters


    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
