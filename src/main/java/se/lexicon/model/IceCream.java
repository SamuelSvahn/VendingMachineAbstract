package se.lexicon.model;

public class IceCream extends Product {

    private String consistency;
    private String flavour;
    private String size;
    private boolean lactose;


    public IceCream(int id, double price, String productName, String consistency, String flavour, String size, boolean lactose) {
        super(id, price, productName);
        setConsistency(consistency);
        setFlavour(flavour);
        setSize(size);
        setLactose(lactose);
    }

    public String examine() {
        return "Id: " + getId() + "Name: " + getProductName() + " Price: " + getPrice();
    }

    public String use() {
        return "Name: " + getProductName() + " When you need to cool down";
    }

    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isLactose() {
        return lactose;
    }

    public void setLactose(boolean lactose) {
        this.lactose = lactose;
    }
}
