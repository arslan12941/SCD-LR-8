package Design_Pattern.Prototype.Service;

import Design_Pattern.Prototype.Entity.Product;
import Design_Pattern.Prototype.Repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional
    public Product cloneProduct(Long originalId, String newColor) {
        Product original = productRepository.findById(originalId)
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));

        Product clone = original.clone();
        clone.setColor(newColor);
        return productRepository.save(clone);
    }
}