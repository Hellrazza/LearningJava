import java.util.Scanner;

public class UIExercises {
    public static void main(String[] args) {
        jokeManagerExercise();
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

    public static void todoListExercise() {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        TodoListUI TodoUI = new TodoListUI(todoList, scanner);

        TodoUI.start();
    }

    public static void gradesExercise() {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        GradesUserInterface gradesUserInterface = new GradesUserInterface(scanner, register);

        gradesUserInterface.start();
    }

    public static void jokeManagerExercise() {
        Scanner scanner = new Scanner(System.in);
        JokeManager manager = new JokeManager();
        JokeManagerUI jokeManagerUI = new JokeManagerUI(manager, scanner);

        jokeManagerUI.start();
    }
}

