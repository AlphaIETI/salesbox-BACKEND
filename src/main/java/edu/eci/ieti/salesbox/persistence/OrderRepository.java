package edu.eci.ieti.salesbox.persistence;


import edu.eci.ieti.salesbox.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrderRepository extends MongoRepository<Order, String> {

    Optional<Order> findById(String id);

}
