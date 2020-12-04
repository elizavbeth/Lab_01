package Lab_01.first09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class first09 {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        char[] arr = str.replace(" ", "").toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Character> notvowels = new ArrayList<>();

        int vCount = 0, nvCount = 0;

        for (char ch : arr) {

            if (isVowel(ch) == true)
                vowels.add(ch);
            else
                notvowels.add(ch);
        }

        for (Character c : vowels) {
            vCount++;
            System.out.print(c + " ");
        }

        System.out.println();
        for (Character c : notvowels) {
            nvCount++;
            System.out.print(c + " ");
        }

        if (nvCount > vCount) {
            System.out.print("Nonvowels > vowels");
        } else {
            System.out.print("Vowels > nonvowels");
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
}
