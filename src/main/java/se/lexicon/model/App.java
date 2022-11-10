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


        // Show all products
        Product[] availProduct = vendingMachine.getProducts();
        System.out.println("All available products\n");
        for (Product availProd : availProduct)
            System.out.println(availProd);

        System.out.println("------------------------------");

        // Show balance
        vendingMachine.addCurrency(100);
        System.out.println(vendingMachine.getBalance()); // 100
        vendingMachine.request(1);
        System.out.println(vendingMachine.getBalance()); // 85
        vendingMachine.endSession();
        System.out.println(vendingMachine.endSession()); // 0



        /*System.out.println("----------------------------");

        vendingMachine.addCurrency(100);
        int newBalance= vendingMachine.getBalance();
        System.out.println(newBalance);

        System.out.println("--------------------------------");

        //Search for specific product
        System.out.println("Search for specific product:");
        String availableProduct = vendingMachine.getDescription(2);
        System.out.println(availableProduct);

        System.out.println("-------------------------------");

        // Buy specific product
        System.out.println("Buy specific product");
        Product request= vendingMachine.request(3);
        System.out.println(request);

        int change=vendingMachine.endSession();
        System.out.println("Change:" +change);
        vendingMachine.getBalance();
        System.out.println(vendingMachine.getBalance());

        System.out.println("------------------------------");*/


    }
}

