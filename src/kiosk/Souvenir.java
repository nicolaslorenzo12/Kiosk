package kiosk;

public class Souvenir {

    private String description;
    private int price;

    public Souvenir(String description, int price){

        this.description = description;
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public int getPrice(){
        return price;
    }
}
