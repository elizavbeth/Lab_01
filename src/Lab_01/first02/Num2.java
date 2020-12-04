package Lab_01.first02;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        String arr[];
        Scanner reader = new Scanner(System.in);
        System.out.printf("Enter amount of elements: ");
        int n = reader.nextInt();
        arr = new String[n];
        System.out.printf("Enter elements of array:\n");
        int y, i, m;

        for (i = 0; i < n; i++) {
            arr[i] = reader.next();
            String.valueOf(arr[i].length());
        }

        for (i = 0; i < n; i++) {
            m = i;
            for (y = i + 1; y < n; y++) {
                if (arr[y].length() < arr[m].length()) {
                    m = y;
                }
                String p = arr[i];
                arr[i] = arr[m];
                arr[m] = p;
            }
        }

        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " " + arr[i].length() + " ");
        }
    }
}
