package Lab_01.first03;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        String[] arr;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Enter amount of elements: ");
        int n = reader.nextInt();
        arr = new String[n];
        System.out.printf("Enter elements of array:\n");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = reader.next();
            String.valueOf(arr[i].length());
        }
        int x = 0;
        for (i = 0; i < n; i++) {
            x += arr[i].length();
        }
        x /= n;
        System.out.println(x);

        for (i = 0; i < n; i++) {
            if (arr[i].length() < x)
                System.out.println(arr[i] + " " + arr[i].length() + " ");
        }
    }
}
