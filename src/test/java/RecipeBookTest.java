import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class RecipeBookTest {
    @Test
    public void getPancakeName() {
        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addRecipes("recipes.txt");

        assertEquals("Pancake dough", recipeBook.getRecipes().get(0).getName());
    }

    @Test
    public void getMeatballsCookingTime() {
        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addRecipes("recipes.txt");

        assertEquals(20, recipeBook.getRecipes().get(1).getCookingTime());
    }

    @Test
    public void findTofuRoll() {
        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addRecipes("recipes.txt");
        recipeBook.findRecipesWithString("roll");
    }

    @Test
    public void findNoRecipesByTime15Mins() {
        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addRecipes("recipes.txt");
        recipeBook.findRecipesWithTime(15);
    }

    @Test
    public void findTwoRecipesByTime30Mins() {
        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addRecipes("recipes.txt");
        recipeBook.findRecipesWithTime(30);
    }

    @Test
    public void oneRecipeByIngredientSugar() {
        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addRecipes("recipes.txt");
        recipeBook.findRecipesWithIngredient("sugar");
    }

    @Test
    public void twoRecipeByIngredientEgg() {
        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addRecipes("recipes.txt");
        recipeBook.findRecipesWithIngredient("egg");
    }

    @Test
    public void testApplicationUIPrintRecipes() {
        String input = """
                recipes.txt
                list
                stop
                """;
        Scanner scanner = new Scanner(input);
        RecipeBook recipeBook = new RecipeBook();
        RecipeBookUI recipeBookUI = new RecipeBookUI(scanner, recipeBook);

        recipeBookUI.start();

    }
}
