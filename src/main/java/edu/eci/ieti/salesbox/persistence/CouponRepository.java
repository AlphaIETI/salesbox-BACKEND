package edu.eci.ieti.salesbox.persistence;

import edu.eci.ieti.salesbox.models.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface CouponRepository extends MongoRepository<Coupon,String> {
    Optional <ArrayList<Coupon>> findByClientId(String clientId);
}