package kiosk;

public class Souvenir {

    private String souvenir;
    private int price;

    public Souvenir(String souvenir, int price){

        this.souvenir = souvenir;
        this.price = price;
    }

    public String getSouvenir(){
        return souvenir;
    }

    public int getPrice(){
        return price;
    }
}
