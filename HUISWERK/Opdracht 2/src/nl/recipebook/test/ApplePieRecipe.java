package nl.recipebook.test;

import java.lang.reflect.Field;

public class ApplePieRecipe {
    char bulletSymbol = '\u2023';
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;
    private Ingredient ingredient4;
    private Ingredient ingredient5;
    private Ingredient ingredient6;
    private Ingredient ingredient7;
    private Ingredient ingredient8;
    private Ingredient ingredient9;
    private Ingredient ingredient10;

    //    Ik wilde een betere methode dan slechts alle ingrediënten 1 voor 1 printen, maar geen list gebruiken.
    //    De reflectieklasse staat on toe om attributen van een klasse te lezen of te schrijven.
    //        Het bulletpoint symbool kunnen we toewijzen aan een variabele met het Unicode symbool hiervoor

    public ApplePieRecipe() {
        this.ingredient1 = new Ingredient("ongezouten roomboter", Ingredient.Unit.GR, 200);
        this.ingredient2 = new Ingredient("witte bastard suiker", Ingredient.Unit.GR, 200);
        this.ingredient3 = new Ingredient("zelfrijzend bakmeel", Ingredient.Unit.GR, 400);
        this.ingredient4 = new Ingredient("ei", Ingredient.Unit.PCS, 1);
        this.ingredient5 = new Ingredient("vanillesuiker", Ingredient.Unit.SNF, 8);
        this.ingredient6 = new Ingredient("zout", Ingredient.Unit.GR, 1);
        this.ingredient7 = new Ingredient("zoetzure appels", Ingredient.Unit.KG, 1.5f);
        this.ingredient8 = new Ingredient("witte bastard suiker", Ingredient.Unit.GR, 75);
        this.ingredient9 = new Ingredient("kaneel", Ingredient.Unit.TS, 3);
        this.ingredient10 = new Ingredient("paneermeel", Ingredient.Unit.GR, 15);

    }

    public void printIngredients() {
        for (int i = 1; i <= 10; i++) { // Loop van 1 tot 10
            try {
                // Dynamisch veld ophalen, bijvoorbeeld "ingredient1", "ingredient2", enz.
                Field field = this.getClass().getDeclaredField("ingredient" + i);
                field.setAccessible(true); // Toegang tot private velden
                Ingredient ingredient = (Ingredient) field.get(this);
                if (ingredient != null) {

                    System.out.println(bulletSymbol + "   " + ingredient);
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace(); // Print een fout als een veld niet bestaat
            }
        }
    }


    public void preheatOven() {
        System.out.println(bulletSymbol + "   " + "Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void beatEgg() {
        System.out.println(bulletSymbol + "   " + "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }


    public void mixIngredients() {
        System.out.println(bulletSymbol + "   " + "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void pealApples() {
        System.out.println(bulletSymbol + "   " + "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greaseSpringform() {
        System.out.println(bulletSymbol + "   " + "Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void applyDough() {
        System.out.println(bulletSymbol + "   " + "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void spreadApples() {
        System.out.println(bulletSymbol + "   " + "Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void cutDough() {
        System.out.println(bulletSymbol + "   " + "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void buildPie() {
        System.out.println(bulletSymbol + "   " + "Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void putInOven() {
        System.out.println(bulletSymbol + "   " + "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


    public void printRecipe() {
        preheatOven();
        beatEgg();
        mixIngredients();
        pealApples();
        greaseSpringform();
        applyDough();
        spreadApples();
        cutDough();
        buildPie();
        putInOven();
    }

}