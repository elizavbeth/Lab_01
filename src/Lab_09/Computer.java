package Lab_09;

public class Computer implements Device {

    @Override
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser + " surfing the internet using computer");
    }

    @Override
    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser + " play computer games");
    }

    @Override
    public void printCopies(String nameOfUser) {

    }

    @Override
    public void turnOnLight(String nameOfUser) {

    }
}
