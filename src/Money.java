public class Money {
    private final int pounds;
    private final int pence;

    public Money(int pounds, int pence) {
        this.pounds = pounds;
        this.pence = pence;
    }

    public int getPounds() {return pounds;}
    public int getPence() {return pence;}

    public String toString() {
        String zero = "";
        if (pence < 10) zero = "0";
        return pounds + "." + zero + pence;
    }

    public Money plus(Money addition) {
        if (this.pence + addition.pence >= 100) {
            return new Money(this.pounds + addition.pounds + 1, this.pence + addition.pence - 100);
        }

        return new Money(this.pounds + addition.pounds, this.pence + addition.pence);
    }

    public Money minus(Money decreaser) {
        int poundsToTake = 0;
        int penceToAdd = 0;

        if (pence - decreaser.pence < 0) {
            poundsToTake++;
            penceToAdd += 100;
        }

        if (pounds - decreaser.pounds - poundsToTake < 0) {
            return new Money(0, 0);
        }

        return new Money(pounds - decreaser.pounds - poundsToTake, pence - decreaser.pence + penceToAdd);


    }


    public boolean lessThan(Money other) {
        if(pounds < other.pounds) {
            return true;
        }

        return pence < other.pence;
    }

}
