package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.exceptions.ProductException;
import edu.eci.ieti.salesbox.models.Product;

import java.util.List;

public interface ProductService {

    /**
     * Metodo para obtener todos los productos
     */
    public List<Product> getAllProducts() throws ProductException;

    /**
     * Metodo para obtener un producto por su id
     */
    public Product getProductById(String id) throws ProductException;

    /**
     * Metodo para obtener productos por su marca
     */
    public List<Product> getProductsByBrand(String brand) throws ProductException;

    /**
     * Metodo para crear un producto
     */
    public Product createProduct(Product product) throws ProductException;

    /**
     * Metodo para remover un producto por su id
     */
    public void removeProductById(String id) throws ProductException;

    /**
     * Metodo para modificar un producto
     */
    public void updateProduct(Product product) throws ProductException;

}
