package edu.eci.ieti.salesbox.persistence;

import edu.eci.ieti.salesbox.models.Promotion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends MongoRepository<Promotion,String> {

}