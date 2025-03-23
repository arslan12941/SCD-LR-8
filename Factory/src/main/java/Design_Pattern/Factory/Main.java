package Design_Pattern.Factory;

import Design_Pattern.Factory.Interface.product;
import Design_Pattern.Factory.Factory.ProductFactory;

public class Main {
    public static void main(String[] args) {
        product laptop = ProductFactory.createProduct("electronics", "Laptop", "Dell", 999.99);
        product jeans = ProductFactory.createProduct("clothing", "Jeans", "M", 49.99);
        product novel = ProductFactory.createProduct("books", "1984", "George Orwell", 19.99);

        laptop.displaydetails();
        System.out.println();
        jeans.displaydetails();
        System.out.println();
        novel.displaydetails();
    }
}