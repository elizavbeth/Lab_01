package Lab_01.first06;

public class Num6 {
    public static void main(String[] args) {
        String string = "We are going to the forest";
        String regex = "\\W++";
        String s = string.replaceAll(regex, "");
        char[] chars = s.toCharArray();
        String newS = "";
        for (int i = 0; i < chars.length; i++) {
            newS += String.valueOf(chars[i]) + " ";
        }
        System.out.println(newS);
    }
}
