package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Product;
import edu.eci.ieti.salesbox.models.Promotion;
import edu.eci.ieti.salesbox.services.ProductService;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    ArrayList<String> NumSizes = new ArrayList<>(Arrays.asList("36","37","38","39"));
    ArrayList<String> LetterSizes = new ArrayList<>(Arrays.asList("XS","S","M","L"));
    ArrayList<Product> products =  new ArrayList<>(Arrays.asList(
            new Product("1", "Nike", "Guayos Mercurial para futbol", "Azul", 250000, NumSizes),
            new Product("2", "Adidas", "Camisa super deportiva", "Negro", 50000, LetterSizes),
            new Product("3", "H&M", "Pantaloneta de Tennis", "Blanco", 170000, LetterSizes),
            new Product("4", "Nike", "Camiseta para Golf", "Roja", 200000, LetterSizes))
    );


    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(String id) {
        Product newProduct = null;
        for(int i=0; i<products.size(); i++){
            if (products.get(i).getId().equals(id)){
                newProduct =  products.get(i);
            }
        }
        return newProduct;
    }

    @Override
    public ArrayList<Product> getProductsByBrand(String brand) {
        ArrayList<Product> newProducts = new ArrayList<>();
        for(int i=0; i<products.size(); i++){
            if (products.get(i).getBrand().equals(brand)){
                newProducts.add(products.get(i));
            }
        }
        return newProducts;
    }

    @Override
    public void updateProduct(Product product, String id) {
    }

    @Override
    public ArrayList<Product> createProduct(Product product) {
        products.add(product);
        return products;
    }

    @Override
    public void removeProductById(String id) {
        int idToDelete = -1;

        for(Product pr: products){
            if(pr.getId().equals(id)){
                idToDelete = products.indexOf(pr);
            }
        }

        if(idToDelete>=0){
            products.remove(idToDelete);
        }

    }
}

