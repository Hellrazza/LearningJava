import java.util.ArrayList;
import java.util.Scanner;

public class GradesStatisticsUI {
    private Scanner scanner;
    private GradesStatistics grades;

    public GradesStatisticsUI(Scanner scanner,GradesStatistics grades) {
        this.scanner = scanner;
        this.grades = grades;
    }


    public void start() {
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {

            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;
            }

            grades.add(input);
        }

        printResults();
    }

    public void printResults() {
        System.out.println("Point average (all):" + grades.getGradeAverage());

        String output = String.valueOf(grades.getPassingGradeAverage());
        if (output.equals("-1.0")) {
            output = "-";
        }

        System.out.println("Point average (passing):" + output);
        System.out.println("Pass percentage: " + grades.getPassingPercentage());
        printGradeDistribution();
    }

    public void printGradeDistribution() {
        int grade = 5;
        System.out.println("Grade Distribution: ");
        while (grade >= 0) {
            System.out.print(grade + ": ");
            printStars(grades.totalGrades(grade));
            System.out.println();
            grade--;
        }
    }


    public void printStars(int numberOfStars) {
        while (numberOfStars > 0) {
            System.out.print("*");
            numberOfStars--;
        }
    }
}
