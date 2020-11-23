package edu.eci.ieti.salesbox.persistence;

import edu.eci.ieti.salesbox.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

    Optional<Client> findById(String id);
    Optional<Client> findByEmail(String email);

}
