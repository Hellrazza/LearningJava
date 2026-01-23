public class MatchDetails {
    private String homeTeam;
    private int homePoints;
    private String awayTeam;
    private int awayPoints;

    public MatchDetails(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }

    public String toString() {
        return this.homeTeam + ": " + this.homePoints + " VS " + this.awayTeam + ": " + this.awayPoints;
    }

    public String getHomeTeam() {return this.homeTeam;}
    public String getAwayTeam() {return this.awayTeam;}

    public int getHomePoints() {return this.homePoints;}
    public int getAwayPoints() {return this.awayPoints;}
}
