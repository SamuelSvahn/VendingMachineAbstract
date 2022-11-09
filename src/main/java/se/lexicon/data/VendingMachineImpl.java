package se.lexicon.data;


import se.lexicon.model.Product;

import java.util.Arrays;


public class VendingMachineImpl implements IVendingMachine {


    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products= products;
    }

    int[] value={1,2,5,10,20,50,100,200,500,1000};
    private String toString(int[] value) {
        return value.toString();
    }


    @Override
    public void addCurrency(int amount) {
        for (int values : value) {
            if (amount == values) {
                depositPool += amount;
            } else {
                System.out.println("Amount is not valid!, Valid amounts are: " + toString(value));
            }
        }
    }



    public int getBalance() {
        return depositPool;
    }

    public Product request(int id) {
       if(depositPool!=)

        return ;
    }

    public int endSession() {
        int change= depositPool;
        depositPool=0;
        return change;
    }

    public String getDescription(int id) {
       return products.toString();

    }
    public String[] getProducts() {
        return new String[0];
    }


}
