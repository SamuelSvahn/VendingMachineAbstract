package se.lexicon.model;

public class Chocolate extends Product {


    private String sort;



    public Chocolate(int id, double price, String productName, String sort) {
        super(id, price, productName);
        setSort(sort);
    }

    public String examine() {
        return "Id: "+getId()+ "Name: "+getProductName()+ " Price: "+ getPrice();
    }

    public String use() {
        return getProductName()+" You are not you when you are hungry";
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
