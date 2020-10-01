package edu.eci.ieti.salesbox.models;
public class Coupon{

    private String id;
    private int percentage;
    private String brand;
    private String endDate;
    private String image;

    public Coupon(String id, int percentage, String brand, String endDate, String image){
        this.id=id;
        this.percentage=percentage;
        this.brand=brand;
        this.endDate=endDate;
        this.image=image;
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
}
