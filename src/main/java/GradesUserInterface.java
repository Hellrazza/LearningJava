import java.util.Scanner;

public class GradesUserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public GradesUserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        String input = "";
        while (true) {
            System.out.println("Points: ");
            input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }

            int points = Integer.parseInt(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradesBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while(grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();

            grade--;
        }
        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }


}
