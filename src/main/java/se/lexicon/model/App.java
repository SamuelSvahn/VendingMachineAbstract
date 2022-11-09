package se.lexicon.model;

import se.lexicon.data.IVendingMachine;
import se.lexicon.data.VendingMachineImpl;

public class App {
    public static void main(String[] args) {

        Chocolate marabou = new Chocolate(1, 15, "Marabou", "Marabou", "Salta Mandlar", "Big");
        IceCream icecream = new IceCream(2, 30, "Ben And Jerrys", "Soft", "Chocolate", "500g", true);
        Soda soda = new Soda(3, 10, "Fanta", "orange", "Coca Cola", "1.5 liters", true);
        Product[] products = {marabou, icecream, soda};

        IVendingMachine vendingMachine = new VendingMachineImpl(products);



    }
}

