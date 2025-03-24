package Design_Pattern.Prototype.Controller;

import Design_Pattern.Prototype.Entity.Product;
import Design_Pattern.Prototype.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PostMapping("/{id}/clone")
    public Product cloneProduct(@PathVariable Long id, @RequestParam String newColor) {
        return productService.cloneProduct(id, newColor);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}