package model;


public abstract class Product {

    //fields
    private int id;
    private double price;
    private String productName;

    public  Product(int id, double price, String productName) {
        setId(id);
        setPrice(price);
        setProductName(productName);
    }



    public abstract String examine();

    public abstract String use();


    //setters and getters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
