package kiosk;

public class Souvenirs {

    private String souvenir;
    private int price;

    public Souvenirs(String souvenir, int price){

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
