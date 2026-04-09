package pack1;

public class Product {
    String pname;
    int price;

    public Product(String pname, int price) {
        this.pname = pname;
        this.price = price;
    }

    public void showpro() {
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }
}