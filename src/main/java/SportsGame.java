import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportsGame {
    public static void main(String[] args) {
        ArrayList<MatchDetails> matches = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();
        String game = "";
        String[] parts;
        int gamesPlayed = 0;
        int wins = 0;
        int loses = 0;
        String gameQuery = "";

        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while(reader.hasNextLine()) {
                game = reader.nextLine();
                parts = game.split(",");
                matches.add(new MatchDetails(parts[0],parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
            }

            System.out.println("Enter Team: ");
            gameQuery = scanner.nextLine();

            for (MatchDetails match : matches) {
                if (match.getHomeTeam().equals(gameQuery)) {
                    gamesPlayed++;
                    if (match.getHomePoints() > match.getAwayPoints()) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
                else if(match.getAwayTeam().equals(gameQuery)) {
                    gamesPlayed++;
                    if (match.getAwayPoints() > match.getHomePoints()) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
            }

            System.out.println("Games played: " + gamesPlayed);
            System.out.println("Games Won: " + wins);
            System.out.println("Games Lost: " + loses);





        } catch (Exception e) {
            System.out.println("Error reading: " + fileName);

        }


    }
}
