package se.lexicon.data;


import se.lexicon.model.Product;

public class VendingMachineImpl implements IVendingMachine {


    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products= products;
    }




    public void addCurrency(int amount) {

    }

    public int getBalance() {
        return 0;
    }

    public Product request(int id) {
        return null;
    }

    public int endSession() {
        return 0;
    }

    public String getDescription(int id) {
        return null;
    }

    public String[] getProducts() {
        return new String[0];
    }
}
