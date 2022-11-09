package se.lexicon.model;

public class Soda extends Product{

    //fields
    private String flavour;

    public Soda(int id, double price, String productName, String flavour) {
        super(id, price, productName);
        setFlavour(flavour);
    }

    public String examine() {
        return "Id: "+getId()+ "Name: "+getProductName()+ " Price: "+ getPrice();
    }

    public String use() {
        return "Name: "+ getProductName()+ "Nothing beats a drink";
    }


    // setters and getters


    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
