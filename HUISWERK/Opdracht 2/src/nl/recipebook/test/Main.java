package nl.recipebook.test;

public class Main {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();

        System.out.println("Ingrediënten:\n");
        recipe.printIngredients();

        System.out.println("\nStappen:\n");
        recipe.printRecipe();
    }
}