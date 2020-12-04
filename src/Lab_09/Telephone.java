package Lab_09;

public class Telephone implements Device {
    @Override
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser + " surfing the internet using telephone");
    }

    @Override
    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser + " play telephone games");
    }

    @Override
    public void printCopies(String nameOfUser) {

    }

    @Override
    public void turnOnLight(String nameOfUser) {

    }
}