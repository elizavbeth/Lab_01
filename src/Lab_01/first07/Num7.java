package Lab_01.first07;

public class Num7 {
    public static void main(String[] args) {
        String text = "Bring me the book on the table.";
        int n = 3;
        System.out.println(text);

        int textLength = text.length();
        char[] reverseArray1 = text.toCharArray();
        for (int i = reverseArray1.length; i >= n; i--)
            if (i < reverseArray1.length) {
                System.out.print(reverseArray1[i]);
            }

        double[] reverseArray2 = {1.2, 1.9, 11.4, 23.8};
        for (int i = reverseArray2.length - 1; i >= n; i--) {
            System.out.println(reverseArray2[i] + " ");
        }
        String[] strArr = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {

            char first = strArr[i].charAt(0);

            if (!((strArr[i].length() % 5 == 0) && ((first != 'a') && (first != 'e') && (first != 'i') && (first != 'o') && (first != 'u') && (first != 'y')))) {

                sb.append(strArr[i]).append(" ");
            }

        }
        String outText = sb.toString().trim();

        // вывод результата
        System.out.println(outText + " " + "\n\n");
    }
}
