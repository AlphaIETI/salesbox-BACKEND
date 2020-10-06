package edu.eci.ieti.salesbox.controllers;

import edu.eci.ieti.salesbox.models.Promotion;
import edu.eci.ieti.salesbox.services.impl.PromotionServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PromotionController {

    @Autowired
    PromotionServiceImpl promotionService;

    @GetMapping("/promotions")
    public List<Promotion> getAllPromotions() {
        return promotionService.getAllPromotions();
    }

    @GetMapping("/promotions/brand/{brand}")
    public List<Promotion> getAllPromotionsByBrand(@PathVariable("brand") String brand) {
        return promotionService.getAllPromotionsByBrand(brand);
    }

    @GetMapping("/promotions/id/{id}")
    public Promotion getPromotionsById(@PathVariable("id") String id) {
        return promotionService.getPromotionsById(id);
    }

    @PostMapping("/promotions")
    public Promotion createPromotion(@RequestBody Promotion newPromotion) {
        // JSON {"id":"","brand":"NafNaf","endDate":"fechaFin","discount":15,"image":"urlImg100","description":"descrip100POST"}
        ObjectId newObjectIdUser = new ObjectId(new Date());
        newPromotion.setId(newObjectIdUser.toHexString());
        return promotionService.createPromotion(newPromotion);
    }

    @PutMapping("/promotions/id/{id}")
    public Promotion updatePromotionById(@RequestBody Promotion updatePromotion, @PathVariable("id") String id) {
        // JSON {"id":"","brand":"NafNaf","endDate":"fechaFinNueva","discount":25,"image":"urlImg100Nueva","description":"descrip100PUT"}
        return promotionService.updatePromotionById(updatePromotion,id);
    }

    @DeleteMapping("/promotions/id/{id}")
    public void removePromotionById(@PathVariable String id) {
        promotionService.removePromotionById(id);
    }
}
