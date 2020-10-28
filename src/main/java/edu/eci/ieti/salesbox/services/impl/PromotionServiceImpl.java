package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.exceptions.PromotionException;
import edu.eci.ieti.salesbox.models.Promotion;
import edu.eci.ieti.salesbox.persistence.PromotionRepository;
import edu.eci.ieti.salesbox.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PromotionServiceImpl implements PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    /**
     * Method that allows to consult all the available promotions.
     *
     * @return Return all available promotions.
     */
    @Override
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    /**
     * Method that allows to consult all the available promotions of a brand.
     *
     * @param brand It is the brand which you want to consult their promotions.
     * @return Returns all available promotions for a brand.
     */
    @Override
    public List<Promotion> getAllPromotionsByBrand(String brand) {
        ArrayList<Promotion> ans = new ArrayList<>();
        for(Promotion pr: promotionRepository.findAll()){
            if(pr.getBrand().equals(brand)){
                ans.add(pr);
            }
        }
        return ans;
    }

    /**
     * Method allowing to consult a promotion by its id.
     *
     * @param id This is the unique identifier of the promotion.
     * @return Returns the promotion corresponding to the id.
     */
    @Override
    public Promotion getPromotionsById(String id) throws PromotionException {
        return promotionRepository.findById(id).orElseThrow(() -> new PromotionException("The promotion with the ID:" + id + " does not exist."));
    }

    /**
     * Method used to create a new promotion.
     *
     * @param newPromotion This is the object that represents the new promotion.
     * @return Returns the object that represents the new promotion.
     */
    @Override
    public Promotion createPromotion(Promotion newPromotion) {
        return promotionRepository.save(newPromotion);
    }

    /**
     * Method used to update an existing promotion.
     *
     * @param updatePromotion This is the object that represents the update of the promotion.
     * @param id              This is the unique identifier of the promotion to be updated.
     * @return Return the object that represents the updated promotion.
     */
    @Override
    public Promotion updatePromotionById(Promotion updatePromotion, String id) {
        return promotionRepository.save(updatePromotion);
    }

    /**
     * Method used to delete an existing promotion.
     *
     * @param id This is the unique identifier of the promotion to be deleted.
     */
    @Override
    public void removePromotionById(String id) {
        promotionRepository.delete(promotionRepository.findById(id).get());
    }
}
