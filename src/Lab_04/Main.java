package Lab_04;

public class Main {
    public static void main(String[] args) {
        ListStack listStack = new ListStack();
        System.out.println("Amount: " + listStack.size());
        listStack.push(5);
        listStack.push(7);
        if (listStack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Amount: " + listStack.size());
        }
        listStack.clear();
        if (listStack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Amount: " + listStack.size());
        }
    }
}