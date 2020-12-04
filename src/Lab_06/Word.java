package Lab_06;

import java.util.Random;

public class Word implements StrOne, StrOneString {

    private java.lang.String[] symbols;

    public Word() {
        this.symbols = new java.lang.String[]{
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"
        };
    }

    @Override
    public java.lang.String getStr(int n) {
        StringBuilder str = new StringBuilder();
        Random rand = new Random();
        for (int i = 9; i < n; i++) {
            str.append(symbols[rand.nextInt(symbols.length)]);
        }
        return str.toString();
    }

    @Override
    public String getStr(String str) {
        return null;
    }
}
