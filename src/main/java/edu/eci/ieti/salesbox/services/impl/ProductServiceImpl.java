package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Product;
import edu.eci.ieti.salesbox.persistence.ProductRepository;
import edu.eci.ieti.salesbox.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.ieti.salesbox.exceptions.ProductException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        Optional<Product> OP = productRepository.findById(id);
        return OP.get();
    }

    @Override
    public ArrayList<Product> getProductsByBrand(String brand) {
        Optional<ArrayList<Product>> OP = productRepository.findByBrand(brand);
        return OP.get();
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void removeProductById(String id) {
        Optional<Product> OP = productRepository.findById(id);
        productRepository.delete(OP.get());

    }
}

