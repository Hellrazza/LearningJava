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

    public boolean isDateBefore(SimpleDate otherDate) {
        if (otherDate.year < year) {return true;}
        if (otherDate.year == year && otherDate.month < month) {return true;}
        if (otherDate.year == year && otherDate.month == month && otherDate.day < day) {return true;}

        return false;
        }

    public void advance() {
        if (this.month == 12 && this.day == 30) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }

        else if (this.day == 30) {
            this.day = 1;
            this.month++;
        }

        else { this.day++;}
    }

    public void advance(int totalDays) {
        this.day += totalDays;

        while (this.day > 30) {
            this.day -= 30;
            this.month++;
        }

        while (this.month > 12) {
            this.month -= 12;
            this.year++;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
