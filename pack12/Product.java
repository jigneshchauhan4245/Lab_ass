package pack12;

import java.util.Scanner;

public class Product {

    String ProductNames[];
    double Prices[];
    int size;


    public Product(int size) {
        this.size = size;
        ProductNames = new String[size];
        Prices = new double[size];
    }

    
    public void acceptProducts() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Product Name: ");
            ProductNames[i] = sc.nextLine();

            System.out.print("Enter Price: ");
            Prices[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        sc.close();
    }

    
    public void displayProducts() {
        System.out.println("\n--- Product List ---");

        for (int i = 0; i < size; i++) {
            System.out.println("Product: " + ProductNames[i].toUpperCase());
            System.out.println("Price: ₹" + Prices[i]);
        }
    }

    
    public void findCostlyProduct() {
        double max = Prices[0];
        int index = 0;

        for (int i = 1; i < size; i++) {
            if (Prices[i] > max) {
                max = Prices[i];
                index = i;
            }
        }

        System.out.println("\n--- Costliest Product ---");
        System.out.println("Product: " + ProductNames[index]);
        System.out.println("Price: ₹" + max);
    }
}