import java.util.ArrayList;

public class GradesStatistics {
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> gradesList;

    public GradesStatistics() {
        this.pointsList = new ArrayList<>();
        this.gradesList = new ArrayList<>();
    }


    public void add(int points) {
        if (points >= 0 && points <= 100 ) {
            pointsList.add(points);
            gradesList.add(pointsToGrade(points));
        }
    }

    public double getGradeAverage() {
        int total = 0;

        for (int grade : pointsList) {
            total += grade;
        }

        return (double) total / pointsList.size();
    }

    public double getPassingGradeAverage() {
        int total = 0;
        int totalPassingGrade = 0;

        for (int grade : pointsList) {
            if (grade >= 50) {
                total += grade;
                totalPassingGrade++;
            }
        }

        if (totalPassingGrade == 0) {
            return -1;
        }

        return (double) total/ totalPassingGrade;
     }


    public double getPassingPercentage() {
        int totalPassed = 0;
        int totalGrades = 0;

        for (int grade : pointsList) {
            if (grade >= 50) {
                totalPassed++;
            }
            totalGrades++;
        }

        return 100 * ((double) totalPassed /totalGrades);
    }


    public int pointsToGrade(int points) {
        if (points < 50) {return 0;}
        else if (points < 60) {return 1;}
        else if (points < 70) {return 2;}
        else if (points < 80) {return 3;}
        else if (points < 90) {return 4;}
        else {return 5;}
    }

    public int totalGrades(int gradeQuery) {
        int total = 0;
        for (int grade : gradesList) {
            if (gradeQuery == grade) {
                total++;
            }
        }

        return total;
    }

}
