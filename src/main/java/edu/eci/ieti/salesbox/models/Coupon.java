package edu.eci.ieti.salesbox.models;
import edu.eci.ieti.salesbox.models.Client;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Coupon{


    @Id
    private String id;
    private int percentage;
    private String brand;
    private String endDate;
    private String image;
    private String clientId;

    public Coupon(String id, int percentage, String brand, String endDate, String image, String clientId){
        this.id=id;
        this.percentage=percentage;
        this.brand=brand;
        this.endDate=endDate;
        this.image=image;
        this.clientId=clientId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPercentage(){
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getClientId(){
        return clientId;
    }

    public void setUser(String clientId){
        this.clientId=clientId;
    }
}
