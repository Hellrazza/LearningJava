import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class GradeStatisticsTest {

    @Test
    public void pointAverage540() {
        GradesStatistics gradesStatistics = new GradesStatistics();
        gradesStatistics.add(-42);
        gradesStatistics.add(24);
        gradesStatistics.add(42);
        gradesStatistics.add(72);
        gradesStatistics.add(80);
        gradesStatistics.add(52);

        assertEquals(54.0, gradesStatistics.getGradeAverage(), 0.0001);
    }

    @Test
    public void pointAverage510() {
        GradesStatistics gradesStatistics = new GradesStatistics();
        gradesStatistics.add(50);
        gradesStatistics.add(51);
        gradesStatistics.add(52);

        assertEquals(51.0, gradesStatistics.getGradeAverage(), 0.0001);
    }

    @Test
    public void pointAverage540UI() {
        String input = "-42\n" + "24\n" + "42\n" + "72\n" + "80\n" + "52\n" + "-1";
        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();

        assertEquals(54.0, statistics.getGradeAverage(), 0.0001);
    }

    @Test
    public void passingPointAverage680() {
        GradesStatistics gradesStatistics = new GradesStatistics();
        gradesStatistics.add(-42);
        gradesStatistics.add(24);
        gradesStatistics.add(42);
        gradesStatistics.add(72);
        gradesStatistics.add(80);
        gradesStatistics.add(52);

        assertEquals(68.0, gradesStatistics.getPassingGradeAverage(), 0.0001);
    }

    @Test
    public void passingPointAverageNoGradesGradeAverage480UI() {
        String input = "49\n" + "48\n" + "47\n" + "-1";
        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();

        assertEquals(48.0, statistics.getGradeAverage(), 0.0001);
        assertEquals(-1, statistics.getPassingGradeAverage(), 0.0001);
    }

    @Test
    public void passingPercentage0UI() {
        String input = "49\n" + "48\n" + "47\n" + "-1";
        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();

        assertEquals(0.0, statistics.getPassingPercentage(), 0.0001);
    }

    @Test
    public void pointAverage525PassingPointAverage880PassPercentage50UI() {
        String input = """
                102
                -4
                33
                77
                99
                1
                -1""";
        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();

        assertEquals(52.5, statistics.getGradeAverage(), 0.0001);
        assertEquals(88.0, statistics.getPassingGradeAverage(), 0.0001);
        assertEquals(50.0, statistics.getPassingPercentage(), 0.0001);
    }

    @Test
    public void points30Grade0() {
        GradesStatistics statistics = new GradesStatistics();
        assertEquals(0,statistics.pointsToGrade(30));
    }

    @Test
    public void points71Grade3() {
        GradesStatistics statistics = new GradesStatistics();
        assertEquals(3, statistics.pointsToGrade(71));
    }

    @Test
    public void print4Stars() {
        Scanner reader = new Scanner("");
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.printStars(4);
    }

    @Test
    public void fourGrade3s() {
        GradesStatistics gradesStatistics = new GradesStatistics();
        gradesStatistics.add(71);
        gradesStatistics.add(71);
        gradesStatistics.add(74);
        gradesStatistics.add(76);

        assertEquals(4, gradesStatistics.totalGrades(3));

    }

    @Test
    public void threeFails2Grade51Grade4PrintStarsUI() {
        String input = """
                32
                21
                35
                -32
                90
                98
                89
                -1""";
        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();

        assertEquals(3, statistics.totalGrades(0));
        assertEquals(2, statistics.totalGrades(5));
        assertEquals(1, statistics.totalGrades(4));

    }

    @Test
    public void oneOfEachGradeUI() {
        String input = """
                49
                59
                69
                79
                89
                99
                -1
                """;

        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();

        assertEquals(1, statistics.totalGrades(0));
        assertEquals(1, statistics.totalGrades(1));
        assertEquals(1, statistics.totalGrades(2));
        assertEquals(1, statistics.totalGrades(3));
        assertEquals(1, statistics.totalGrades(4));
        assertEquals(1, statistics.totalGrades(5));
    }

    @Test
    public void pointAverage525passPointAverage880PassPercentage5001Grade51Grade32Grade0UI() {
        String input = """
                102
                -2
                1
                33
                77
                99
                -1
                """;
        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();

        assertEquals(52.5, statistics.getGradeAverage(), 0.0001);
        assertEquals(88.0, statistics.getPassingGradeAverage(), 0.0001);
        assertEquals(50.0, statistics.getPassingPercentage(), 0.0001);
        assertEquals(1, statistics.totalGrades(5));
        assertEquals(1, statistics.totalGrades(3));
        assertEquals(2, statistics.totalGrades(0));
    }


    @Test
    public void applicationTest() {
        String input = """
                124
                -125
                24
                61
                51
                78
                21
                59
                98
                12
                65
                34
                79
                59
                40
                79
                80
                40
                48
                69
                -2
                -1
                """;

        Scanner reader = new Scanner(input);
        GradesStatistics statistics = new GradesStatistics();
        GradesStatisticsUI statisticsUI = new GradesStatisticsUI(reader, statistics);

        statisticsUI.start();
    }



}
