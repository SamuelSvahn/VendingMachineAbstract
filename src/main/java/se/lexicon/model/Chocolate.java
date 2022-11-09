package se.lexicon.model;

public class Chocolate extends Product {


    private String brand;
    private String taste;
    private String size;




    public Chocolate(int id, double price, String productName, String brand, String taste, String size) {
        super(id, price, productName);
        setBrand(brand);
        setTaste(taste);
        setSize(size);
    }

    public String examine() {
        return "Id: "+getId()+ "Name: "+getProductName()+ " Price: "+ getPrice();
    }

    public String use() {
        return getProductName()+" You are not you when you are hungry";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String sort) {
        this.brand = sort;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
