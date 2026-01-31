import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipes(String fileName) {
        ArrayList<String> recipeParts = new ArrayList<>();
        try (Scanner reader = new Scanner(Objects.requireNonNull(getClass().
                getClassLoader().getResourceAsStream(fileName)))) {
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    String name = recipeParts.getFirst();
                    recipeParts.removeFirst();
                    int cookingTime = Integer.parseInt(recipeParts.getFirst());
                    recipeParts.removeFirst();
                    recipes.add(new Recipe(name, cookingTime, new ArrayList<>(recipeParts)));
                    recipeParts.clear();
                } else {
                    recipeParts.add(line);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Cannot open file: " + fileName, e);
        }
    }

    public ArrayList<Recipe> getRecipes() {return recipes;}

    public void findRecipesWithString(String searchQuery) {
        for (Recipe recipe : recipes) {
            if(recipe.getName().contains(searchQuery)) {
                System.out.println(recipe);
            }
        }
    }

    public void printRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }


    public void findRecipesWithTime(int cookingTime) {
        for(Recipe recipe : recipes) {
            if(recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findRecipesWithIngredient(String ingredientQuery) {
        for (Recipe recipe : recipes) {
            for (String ingredient : recipe.getIngredients()) {
                if (ingredient.equals(ingredientQuery)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
