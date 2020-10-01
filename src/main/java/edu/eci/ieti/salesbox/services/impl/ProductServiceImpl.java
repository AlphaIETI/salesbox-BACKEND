package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Product;
import edu.eci.ieti.salesbox.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    List<String> NumSizes = Arrays.asList("XS","S","M","L");
    List<String> LetterSizes = Arrays.asList("XS","S","M","L");
    List<Product> products =  Arrays.asList(
            new Product(1, "Nike", "Guayos Mercurial para futbol", "Azul", 250000, NumSizes),
            new Product(2, "Adidas", "Camisa super deportiva", "Negro", 50000, LetterSizes),
            new Product(3, "H&M", "Pantaloneta de Tennis", "Blanco", 170000, LetterSizes),
            new Product(4, "Nike", "Camiseta para Golf", "Roja", 200000, LetterSizes)
    );


    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        Product newProduct = null;
        for(int i=0; i<products.size(); i++){
            if (products.get(i).getId()==id){
                newProduct =  products.get(i);
            }
        }
        return newProduct;
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        List<Product> newProducts = null;
        for(int i=0; i<products.size(); i++){
            if (products.get(i).getBrand()==brand){
                newProducts.add(products.get(i));
            }
        }
        return newProducts;
    }

    @Override
    public void updateProduct(Product product, int id) {

    }

    @Override
    public List<Product> createProduct(Product product) {
        products.add(product);
        return products;
    }

    @Override
    public void removeProductById(int id) {

        for(int i=0; i<products.size(); i++){
            if (products.get(i).getId()==id){
                products.remove(i);
            }
        }
    }
}

