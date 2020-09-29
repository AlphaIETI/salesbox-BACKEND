package edu.eci.ieti.salesbox.services;

import edu.eci.ieti.salesbox.models.Promotion;

import java.util.List;

public interface PromotionService {

    /**
     * Method that allows to consult all the available promotions.
     * @return  Return all available promotions.
     */
    public List<Promotion> getAllPromotions();

    /**
     * Method that allows to consult all the available promotions of a brand.
     * @param brand It is the brand which you want to consult their promotions.
     * @return  Returns all available promotions for a brand.
     */
    public List<Promotion> getAllPromotionsByBrand (String brand);

    /**
     * Method allowing to consult a promotion by its id.
     * @param id    This is the unique identifier of the promotion.
     * @return  Returns the promotion corresponding to the id.
     */
    public Promotion getPromotionsById (String id);

    /**
     * Method used to create a new promotion.
     * @param newPromotion  This is the object that represents the new promotion.
     * @return  Returns the object that represents the new promotion.
     */
    public Promotion createPromotion (Promotion newPromotion);

    /**
     * Method used to update an existing promotion.
     * @param updatePromotion   This is the object that represents the update of the promotion.
     * @param id    This is the unique identifier of the promotion to be updated.
     * @return  Return the object that represents the updated promotion.
     */
    public Promotion updatePromotionById (Promotion updatePromotion, String id);

    /**
     * Method used to delete an existing promotion.
     * @param id    This is the unique identifier of the promotion to be deleted.
     */
    public void removePromotionById (String id);

}
