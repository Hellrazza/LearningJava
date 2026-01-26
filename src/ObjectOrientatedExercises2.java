public class ObjectOrientatedExercises2 {
    public static void main(String[] args) {
        ProductExercise();
    }

    public static void TimerExercise() {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }

    public static void CubeExercise() {
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }

    public static void FitbyteExercise() {
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage += 0.1;
        }
    }

    public static void ProductExercise() {
        Product tapeMeasure = new Product("Tape Measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
