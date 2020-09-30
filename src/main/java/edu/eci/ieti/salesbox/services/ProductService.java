package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.models.Product;

import java.util.List;

public interface ProductService {

    /**
     * Metodo para obtener todos los productos
     */
    public List<Product> getAllProducts();

    /**
     * Metodo para obtener un producto por su id
     */
    public Product getProductById(int id);

    /**
     * Metodo para obtener productos por su marca
     */
    public List<Product> getProductByBrand(String brand);

    /**
     * Metodo para modificar un producto
     */
    public void updateProduct(String Product);



}
