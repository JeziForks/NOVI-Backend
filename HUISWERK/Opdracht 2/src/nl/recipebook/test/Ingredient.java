package nl.recipebook.test;


public class Ingredient {
    private String name;
    private Unit unit; // Omdat ik niet steeds de volledige unit wil uitschrijven, gebruik ik de enum als type.
    private float amount;


    public Ingredient(String name, Unit unit, float amount) {
        this.name = name;
        this.unit = unit;
        this.amount = amount;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float name) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    // De enum definieert een vaste lijst van mogelijke eenheden.
    // "Enum" is een afkorting van "enumeration", wat letterlijk betekent "opsomming".
    // Een enum lijst vormt een klasse (hierboven toegepast binnen de klasse Ingredient) waarmee we een lijst van afkortingen als constante waarden kunnen gebruiken.
    public enum Unit {
        GR("grams"),   // Afkorting voor gram
        PCS("pieces"), // Afkorting voor stuks
        SNF("pinches"), // Afkorting voor snufjes
        KG("kilos"),   // Afkorting voor kilogrammen
        TS("teaspoons"); // Afkorting voor theelepels


        // Hier instantiëren we een stringobject (description) dat de volledige naam van de eenheid bevat.
        // Dit attribuut is private en onaanpasbaar (final) om de consistentie van enumwaarden te waarborgen.
        private final String description;


        // Constructor voor de enum.
        // Deze constructor koppelt elke enumwaarde aan een specifieke beschrijving.
        Unit(String description) {
            this.description = description;
        }


        // Met de methode getDescription() geven we de string terug die aan de enumwaarde gekoppeld is.
        public String getDescription() {
            return description;
        }

    }
}


//        System.out.println("-   " + amount + " " + unit + " " + name + " " );