package Lab_06;

public class Author implements Str {
    private String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String getStr() {
        return this.authorName;
    }
}
