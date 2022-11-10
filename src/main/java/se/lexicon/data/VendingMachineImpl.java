package se.lexicon.data;


import se.lexicon.model.Product;

import java.util.Arrays;


public class VendingMachineImpl implements IVendingMachine {


    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;

    }


    int[] value = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};


    public void addCurrency(int amount) {
        int valid_currency[] = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int change = Arrays.binarySearch(valid_currency, amount);
        if (change >= 0)
            this.depositPool += amount;
        else System.out.println("Please Deposit valid Currency");
    }


    public int getBalance() {
        return depositPool;
    }

    public Product request(int id) {


        for (Product prod : products) {
            if (depositPool >= prod.getPrice()) {
                if (id == prod.getId()) this.depositPool -= prod.getPrice();
                return prod;
            }
        }


        return null;
    }

    public int endSession() {
        int tmp = this.depositPool;
        this.depositPool = 0;
        return tmp;
    }

    public String getDescription(int id) {
        for (Product productElement : products) {
            if (productElement.getId() == id) {
                return productElement.toString();
            }
        }


        return "No product was found";

    }

    public Product[] getProducts() {

        return products;
    }


}
