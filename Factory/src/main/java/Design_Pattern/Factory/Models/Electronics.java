package Design_Pattern.Factory.Models;

import Design_Pattern.Factory.Interface.product;

public class Electronics implements product {
    private final String name;
    private final String brand;
    private final double price;

    public Electronics(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void displaydetails() {
        System.out.println("Electronic: " + name + "\nBrand: " + brand + "\nPrice: $" + price);
    }
}