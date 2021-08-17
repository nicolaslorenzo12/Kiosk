package kiosk;
import java.util.ArrayList;
import java.util.Scanner;

public class SouvenirsService {

    ArrayList<Souvenir> souvenirs = new ArrayList();
    private final Scanner sc = new Scanner(System.in);

    public SouvenirsService(){
        Souvenir souvenir1 = new Souvenir("Minipizza", 5);
        Souvenir souvenir2 = new Souvenir("Donut", 3);
        Souvenir souvenir3 = new Souvenir("Sandwich", 4);
        Souvenir souvenir4 = new Souvenir("Coke", 4);
        Souvenir souvenir5 = new Souvenir("Beer", 2);
        Souvenir souvenir6 = new Souvenir("Milkshake", 6);
        souvenirs.add(souvenir1);
        souvenirs.add(souvenir2);
        souvenirs.add(souvenir3);
        souvenirs.add(souvenir4);
        souvenirs.add(souvenir5);
        souvenirs.add(souvenir6);
    }

    public void Welcoming(){
        System.out.println("Welcome to my kiosk");
        System.out.println("Please see our souvenirs and their prices");

        for(int x = 0; x < souvenirs.size(); x++){
            System.out.println(souvenirs.get(x).getSouvenirs() + " " + souvenirs.get(x).getPrice() + "$");
        }
    }

    public void Order(){

        String order = "";
        int totalPrice = 0;
        boolean souvenirFound = false;

        while(!order.equals("exit")){

            System.out.println("Please type correctly the souvenir that you want, if you do not want something else please type (exit)");
            order = sc.nextLine();

            for(int x = 0; x < souvenirs.size(); x++){

                if(order.equals(souvenirs.get(x).getSouvenirs())){

                    totalPrice = totalPrice + souvenirs.get(x).getPrice();
                    System.out.println("You just ordered " + souvenirs.get(x).getSouvenirs());
                    System.out.println("For the moment the amount of money that you should pay is " + totalPrice + "$");
                    souvenirFound = true;
                    x = souvenirs.size();
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

