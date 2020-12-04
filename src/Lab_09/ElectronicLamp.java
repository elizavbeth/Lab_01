package Lab_09;

public class ElectronicLamp implements Device {
    @Override
    public void surfingTheInternet(String nameOfUser) {

    }

    @Override
    public void playGames(String nameOfUser) {

    }

    @Override
    public void printCopies(String nameOfUser) {

    }

    @Override
    public void turnOnLight(String nameOfUser) {
        System.out.println(nameOfUser + " turned on the light");
    }
}
