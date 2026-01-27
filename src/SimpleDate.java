import javax.print.attribute.standard.MediaSize;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedSimpleDate = (SimpleDate) compared;
        return day == comparedSimpleDate.day && month == comparedSimpleDate.month && year == comparedSimpleDate.year;
    }

}
