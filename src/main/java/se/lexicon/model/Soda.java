package se.lexicon.model;

public class Soda extends Product{

    //fields
    private String flavour;
    private String brand;
    private String size;
    private boolean sparkles;

    public Soda(int id, double price, String productName, String flavour, String brand, String size, boolean sparkles) {
        super(id, price, productName);
        setFlavour(flavour);
        setBrand(brand);
        setSize(size);
        setSparkles(sparkles);
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isSparkles() {
        return sparkles;
    }

    public void setSparkles(boolean sparkles) {
        this.sparkles = sparkles;
    }
}
