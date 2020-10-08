package edu.eci.ieti.salesbox.persistence;

import edu.eci.ieti.salesbox.models.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends MongoRepository<Coupon,String> {

}