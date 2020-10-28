package edu.eci.ieti.salesbox.controllers;

import edu.eci.ieti.salesbox.models.Product;
import edu.eci.ieti.salesbox.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"https://salesbox-alpha.herokuapp.com","http://localhost:3000"})
public class ProductController {


    @Autowired
    ProductServiceImpl psi = new ProductServiceImpl();

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return psi.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable String id){
        return psi.getProductById(id);
    }

    @GetMapping("/products/brand/{brand}")
    public List<Product> getProductsByBrand(@PathVariable String brand){
        return psi.getProductsByBrand(brand);
    }

    @PutMapping("/products/{product,id}")
    public void changeProductById(@PathVariable Product product, String id){
        psi.updateProduct(product, id);
    }

    @PostMapping("/Products")
    public void createProduct(@RequestBody Product product){
        psi.createProduct(product);
    }

    @DeleteMapping("/Products/{id}")
    public void removeProductById(@PathVariable String id){
        psi.removeProductById(id);
    }

}