package edu.eci.ieti.salesbox.persistence;

import edu.eci.ieti.salesbox.models.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EntityRepository extends MongoRepository<Entity,String> {

    Optional<Entity> findByName(String name);
    Optional<Entity> findByEmail(String email);

}


