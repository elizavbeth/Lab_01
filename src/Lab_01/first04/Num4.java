package Lab_01.first04;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        char symbol = '+';
        String sum = "";
        int k = 3;
        String[] array = text.split("\\s");
        for (int i = 0; i < array.length; i++) {
            char[] chars = array[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (j == k) {
                    chars[j] = symbol;
                }
            }
            array[i] = String.valueOf(chars);
            sum += array[i] + " ";
        }
        System.out.println(sum);
    }
}