package Lab_06;

public class Week implements Str {
    private int dayOfWeek;
    private java.lang.String[] days;

    public Week(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        this.days = new java.lang.String[]{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }


    @Override
    public String getStr() {
        return String.valueOf(this.days[this.dayOfWeek-1]);
    }
}