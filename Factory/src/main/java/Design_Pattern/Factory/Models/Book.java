package Design_Pattern.Factory.Models;

import Design_Pattern.Factory.Interface.product;

public class Book implements product {
    private final String title;
    private final String author;
    private final double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public void displaydetails() {
        System.out.println("Book: " + title + "\nAuthor: " + author + "\nPrice: $" + price);
    }
}