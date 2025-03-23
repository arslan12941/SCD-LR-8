package Design_Pattern.Factory.Models;

import Design_Pattern.Factory.Interface.product;

public class Clothing implements product {
    private final String type;
    private final String size;
    private final double price;

    public Clothing(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public void displaydetails() {
        System.out.println("Clothing: " + type + "\nSize: " + size + "\nPrice: $" + price);
    }
}