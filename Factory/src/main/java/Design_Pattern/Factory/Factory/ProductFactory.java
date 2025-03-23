package Design_Pattern.Factory.Factory;

import Design_Pattern.Factory.Interface.product;
import Design_Pattern.Factory.Models.Book;
import Design_Pattern.Factory.Models.Clothing;
import Design_Pattern.Factory.Models.Electronics;

public class ProductFactory {
    public static product createProduct(String type, String name, String attribute, double price) {
        return switch (type.toLowerCase()) {
            case "electronics" -> new Electronics(name, attribute, price);
            case "clothing" -> new Clothing(name, attribute, price);
            case "books" -> new Book(name, attribute, price);
            default -> throw new IllegalArgumentException("Invalid product type");
        };
    }
}