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
    public List<Product> getProductsByBrand(String brand);

    /**
     * Metodo para crear un producto
     */
    public List<Product> createProduct(Product product);

    /**
     * Metodo para remover un producto por su id
     */
    public void removeProductById(int id);

    /**
     * Metodo para modificar un producto
     */
    public void updateProduct(Product product, int id);





}
