package edu.eci.ieti.salesbox.controllers;

import edu.eci.ieti.salesbox.models.Product;
import edu.eci.ieti.salesbox.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl psi = new ProductServiceImpl();

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return psi.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id){
        return psi.getProductById(id);
    }

    @GetMapping("/products/{brand}")
    public List<Product> getProductsByBrand(@PathVariable String brand){
        return psi.getProductsByBrand(brand);
    }

    @PutMapping("/product/{product,id}")
    public void changeProductById(@PathVariable Product product, String id){
        psi.updateProduct(product, id);
    }

    @PostMapping("/addProduct")
    public void createProduct(@RequestBody Product product){
        psi.createProduct(product);
    }

    @DeleteMapping("/removeProduct/{id}")
    public void removeProductById(@PathVariable String id){
        psi.removeProductById(id);
    }

}