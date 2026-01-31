import java.util.Scanner;

public class GradeStatisticsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradesStatistics grades = new GradesStatistics();
        GradesStatisticsUI gradesStatisticsUI = new GradesStatisticsUI(scanner, grades);

        gradesStatisticsUI.start();
    }
}
