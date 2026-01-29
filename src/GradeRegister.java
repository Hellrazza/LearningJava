import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradesBasedOnPoints(int points) {
        grades.add(pointsToGrades(points));
        examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrades(int points) {
        int grade = 0;
        if (points < 50) {
            return grade;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if(grades.isEmpty()) {
            return -1;
        }
        int totalGrades = 0;

        for (int grade : grades) {
            totalGrades+= grade;
        }

        return (double) totalGrades / grades.size();
    }

    public double averageOfPoints() {
        if(grades.isEmpty()) {
            return -1;
        }
        int totalPoints = 0;

        for (int points : examPoints) {
            totalPoints += points;
        }

        return (double) totalPoints / grades.size();
    }
}
