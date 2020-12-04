package Lab_01.first01;
//Ctrl+Alt+Shift+L

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        String[] arr; //створила масив
        Scanner reader = new Scanner(System.in);
        System.out.printf("Enter amount of elements: ");
        int n = reader.nextInt(); //читаю кількість елементів масиву
        arr = new String[n];
        System.out.printf("Enter elements of array:\n"); //читаю самі елементи масиву
        int maxIndex = 0; //створила змінну, через яку буду шукати елемент з найдовшою довжиною
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = reader.next();
            String.valueOf(arr[i].length());
        }

        for (i = 1; i < n; i++) {
            if (arr[i].length() > arr[maxIndex].length())
                maxIndex = i;
        }

        int minIndex = 0;
        for (i = 1; i < n; i++) {
            if (arr[i].length() < arr[minIndex].length())
                minIndex = i;
        }

        System.out.printf(arr[maxIndex] + ": ");
        System.out.printf(String.valueOf(arr[maxIndex].length()));
        System.out.printf('\n' + arr[minIndex] + ": ");
        System.out.printf(String.valueOf(arr[minIndex].length()));
    }
}
