package kiosk;

public class Souvenir {

    private String souvenirs;
    private int price;

    public Souvenir(String souvenir, int price){

        this.souvenirs = souvenir;
        this.price = price;
    }

    public String getSouvenirs(){
        return souvenirs;
    }

    public int getPrice(){
        return price;
    }
}
