import java.util.Scanner;

public class RecipeBookUI {
    private Scanner scanner;
    private RecipeBook recipeBook;

    public RecipeBookUI(Scanner scanner, RecipeBook recipeBook) {
        this.scanner = scanner;
        this.recipeBook = recipeBook;
    }

    public void start() {
        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();

        recipeBook.addRecipes(fileName);
        System.out.println(recipeBook.getRecipes().getFirst().getName());
    }
}
