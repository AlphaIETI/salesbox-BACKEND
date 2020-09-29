package edu.eci.ieti.salesbox.services.impl;

import edu.eci.ieti.salesbox.models.Promotion;
import edu.eci.ieti.salesbox.services.PromotionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {

    // PromotionArrayTest
    private static ArrayList<Promotion> promotionTests = new ArrayList<>(Arrays.asList(new Promotion("1","Nike","fechaFin",30,"urlImg1","descrip1"),
                                                                            new Promotion("2","Adidas","fechaFin",35,"urlImg2","descrip2"),
                                                                            new Promotion("3","Nike","fechaFin",25,"urlImg3","descrip3"),
                                                                            new Promotion("4","Adidas","fechaFin",20,"urlImg4","descrip4"),
                                                                            new Promotion("5","Nike","fechaFin",35,"urlImg5","descrip5"),
                                                                            new Promotion("6","Adidas","fechaFin",45,"urlImg6","descrip6"),
                                                                            new Promotion("7","H&M","fechaFin",40,"urlImg7","descrip7"),
                                                                            new Promotion("8","Nike","fechaFin",65,"urlImg8","descrip8"),
                                                                            new Promotion("9","H&M","fechaFin",70,"urlImg9","descrip9"),
                                                                            new Promotion("10","H&M","fechaFin",60,"urlImg10","descrip10")));

    /**
     * Method that allows to consult all the available promotions.
     *
     * @return Return all available promotions.
     */
    @Override
    public List<Promotion> getAllPromotions() {
        return promotionTests;
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
        for(Promotion pr: promotionTests){
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
    public Promotion getPromotionsById(String id) {
        Promotion ans = null;
        for(Promotion pr: promotionTests){
            if(pr.getId().equals(id)){
                ans = pr;
            }
        }
        return ans;
    }

    /**
     * Method used to create a new promotion.
     *
     * @param newPromotion This is the object that represents the new promotion.
     * @return Returns the object that represents the new promotion.
     */
    @Override
    public Promotion createPromotion(Promotion newPromotion) {
        promotionTests.add(newPromotion);
        return newPromotion;
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
        Promotion updatePr = null;
        for(Promotion pr: promotionTests){
            if(pr.getId().equals(id)){
                pr.setBrand(updatePromotion.getBrand());
                pr.setDescription(updatePromotion.getDescription());
                pr.setDiscount(updatePromotion.getDiscount());
                pr.setEndDate(updatePromotion.getEndDate());
                pr.setImage(updatePromotion.getImage());
                updatePr = pr;
            }
        }
        return updatePr;
    }

    /**
     * Method used to delete an existing promotion.
     *
     * @param id This is the unique identifier of the promotion to be deleted.
     */
    @Override
    public void removePromotionById(String id) {
        int position = -1;
        for(Promotion pr: promotionTests){
            if(pr.getId().equals(id)){
                position = promotionTests.indexOf(pr);
            }
        }
        if(position>=0){
            promotionTests.remove(position);
        }
    }
}
