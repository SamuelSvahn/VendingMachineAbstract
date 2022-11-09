package model;

public class Chocolate extends Product {


    private String sort;



    public Chocolate(int id, double price, String productName, String sort) {
        super(id, price, productName);
        setSort(sort);
    }

    public String examine() {
        return null;
    }

    public String use() {
        return null;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
