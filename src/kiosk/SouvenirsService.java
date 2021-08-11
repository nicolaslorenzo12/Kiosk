package kiosk;
import java.util.ArrayList;
import java.util.Scanner;

public class SouvenirsService {

    ArrayList<Souvenirs> souvenir = new ArrayList<Souvenirs>();
    private final Scanner sc = new Scanner(System.in);

    public SouvenirsService(){
        Souvenirs souvenir1 = new Souvenirs("Minipizza", 5);
        Souvenirs souvenir2 = new Souvenirs("Donut", 3);
        Souvenirs souvenir3 = new Souvenirs("Sandwich", 4);
        Souvenirs souvenir4 = new Souvenirs("Coke", 4);
        Souvenirs souvenir5 = new Souvenirs("Beer", 2);
        Souvenirs souvenir6 = new Souvenirs("Milkshake", 6);
        souvenir.add(souvenir1);
        souvenir.add(souvenir2);
        souvenir.add(souvenir3);
        souvenir.add(souvenir4);
        souvenir.add(souvenir5);
        souvenir.add(souvenir6);

    }

    public void Welcoming(){
        System.out.println("Welcome to my kiosk");
        System.out.println("Please see our souvenirs and their prices");

        for(int x = 0; x < souvenir.size(); x++){
            System.out.println(souvenir.get(x).getSouvenir() + " " + souvenir.get(x).getPrice() + "$");
        }
    }

    public void Order(){

        String order = "";
        int totalPrice = 0;
        boolean souvenirFound = false;

        while(!order.equals("exit")){

            System.out.println("Please type correctly the souvenir that you want, if you do not want something else please type (exit)");
            order = sc.nextLine();

            for(int x = 0; x < souvenir.size(); x++){

                if(order.equals(souvenir.get(x).getSouvenir())){

                    totalPrice = totalPrice + souvenir.get(x).getPrice();
                    System.out.println("You just ordered " + souvenir.get(x).getSouvenir());
                    System.out.println("For the moment the amount of money that you should pay is " + totalPrice + "$");
                    souvenirFound = true;
                    x = souvenir.size();
                }
            }

            if(!souvenirFound && !order.equals("exit")){
                System.out.println("Check what you just typed");
            }
            else if(order.equals("exit")){
                System.out.println("The total amount of money you have to pay is " + totalPrice + "$");
            }

            souvenirFound = false;
        }
    }

}

