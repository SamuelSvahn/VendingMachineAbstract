package model;

public class IceCream extends Product{

    private String consistency;


    public IceCream(int id, double price, String productName, String consistency) {
        super(id, price, productName);
        setConsistency(consistency);
    }

    public String examine() {
        return null;
    }

    public String use() {
        return null;
    }

    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }
}
