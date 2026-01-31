import org.junit.Test;

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
}
