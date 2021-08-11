package kiosk;

public class Kiosk {
    public static void main(String[] args) {

        var kioskWaiter = new SouvenirsService();

        kioskWaiter.Welcoming();
        kioskWaiter.Order();
    }
}
