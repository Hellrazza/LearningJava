import java.util.Scanner;

public class BirdRegisterExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdRegister birdRegister = new BirdRegister();
        BirdRegisterUI birdRegisterUI = new BirdRegisterUI(scanner, birdRegister);

        birdRegisterUI.start();
    }
}
