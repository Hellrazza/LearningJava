public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.getSquares() > compared.getSquares()) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int thisTotalPrice = this.pricePerSquare * this.getSquares();
        int comparedTotalPrice = compared.getPricePerSquare() * compared.getSquares();
        return Math.abs(thisTotalPrice - comparedTotalPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return (this.getPricePerSquare() * this.getSquares()) > (compared.getPricePerSquare() * compared.getSquares());
    }

    public int getPricePerSquare() {return pricePerSquare;}
    public int getSquares() {return squares;}
}
