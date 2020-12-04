package Lab_09;

public class Main {
    public static void main(String[] args) {
        User user = new User("Klara");

        user.setDevice(new Computer());
        user.playGame();
        user.surfingTheInternet();

        user.setDevice(new Telephone());
        user.playGame();
        user.surfingTheInternet();

        user.setDevice(new ElectronicLamp());
        user.playGame();
        user.surfingTheInternet();

        user.setDevice(new Printer());
        user.playGame();
        user.surfingTheInternet();
    }
}
