package edu.eci.ieti.salesbox.persistence;

import edu.eci.ieti.salesbox.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    Optional<ArrayList<Product>> findByBrand(String brand);
    Optional<Product> findById(String id);

}
