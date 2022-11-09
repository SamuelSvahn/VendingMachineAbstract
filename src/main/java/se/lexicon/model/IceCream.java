package se.lexicon.model;

public class IceCream extends Product{

    private String consistency;


    public IceCream(int id, double price, String productName, String consistency) {
        super(id, price, productName);
        setConsistency(consistency);
    }

    public String examine() {
        return "Id: "+getId()+ "Name: "+getProductName()+ " Price: "+ getPrice();
    }

    public String use() {
        return "Name: "+ getProductName()+ " When you need to cool down";
    }

    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }
}
