package Lab_12;

public class NoSuchElement extends MyException {
    private final String detailText;

    NoSuchElement(int number, String message) {
        super(number, message);
        this.detailText = "No such element";
    }
}
