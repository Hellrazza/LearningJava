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

    loop:    while (true) {
            System.out.println(""" 
                    Commands
                    list - lists the recipes
                    stop - stops the program
                    find name - searches recipes by name
                    find cooking time - searches recipes by cooking time
                    
                    Enter command:
                    """);
            String input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "list":
                    printRecipes();
                    break;
                case "stop":
                    break loop;
                case "find name":
                    findRecipeByName();
                    break;
                case "find cooking time":
                    findRecipeByCookingTime();
                    break;
                case "find ingredient":
                    findRecipesByIngredients();
                    break;
                default:
                    System.out.println("Unknown Command");
            }
        }
    }


    public void printRecipes() {
        System.out.println("Recipes: ");
        recipeBook.printRecipes();
        System.out.println();
    }

    public void findRecipeByName() {
        System.out.println("Enter name to search for:");
        String query = scanner.nextLine();
        System.out.println("Recipes: ");
        recipeBook.findRecipesWithString(query);
        System.out.println();
    }

    public void findRecipeByCookingTime() {
        System.out.println("Enter max amount of time to search for: ");
        int cookingTime = Integer.parseInt(scanner.nextLine());
        System.out.println("Recipes: ");
        recipeBook.findRecipesWithTime(cookingTime);
        System.out.println();
    }

    public void findRecipesByIngredients() {
        System.out.println("Enter ingredient to search with: ");
        String ingredientQuery = scanner.nextLine();
        System.out.println("Recipes: ");
        recipeBook.findRecipesWithIngredient(ingredientQuery);
        System.out.println();
    }
}
