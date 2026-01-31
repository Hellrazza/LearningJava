import java.util.Scanner;

public class RecipeBookExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeBook = new RecipeBook();
        RecipeBookUI recipeBookUI = new RecipeBookUI(scanner, recipeBook);

        recipeBookUI.start();
    }
}
