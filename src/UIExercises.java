import java.util.Scanner;

public class UIExercises {
    public static void main(String[] args) {
        simpleDictionaryExercise();
    }



    public static void userInterfaceExercise() {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface(scanner);
        userInterface.start();
    }

    public static void simpleDictionaryExercise() {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary book = new SimpleDictionary();
        TextUI textUI = new TextUI(scanner, book);

        textUI.start();
    }
}

