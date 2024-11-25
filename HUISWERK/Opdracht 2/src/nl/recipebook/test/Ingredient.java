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

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String toString() {
        // Ik formatteer de ingrediënten zoals ze moeten worden weergegeven en controleer daarbij eerst of de waarde van `amount` een heel getal is. Een enum voor de 2 formats amounts was waarschijnlijk beter en sneller geweest in dit geval.

/*        - **amount**: Dit is een `float` dat de hoeveelheid van een ingrediënt voorstelt.
          - **(int) amount**: Dit converteert `amount` naar een `int`, wat betekent dat het eventuele decimalen weglaat en alleen het gehele nummer behoudt.
          - **amount == (int) amount**: Deze vergelijking controleert of de float `amount` geen decimalen heeft. Dat wil zeggen, `amount` is een geheel getal als de waarde gelijk blijft na omzetten naar `int`.*/
        String formattedAmount = (amount == (int) amount) ? String.format("%d", (int) amount) : String.format("%.1f", amount);

        return formattedAmount + " " + (unit != null ? unit.getDescription() : "") + " " + name;
    }


    // De enum definieert een vaste lijst van mogelijke eenheden.
    // "Enum" is een afkorting van "enumeration", wat letterlijk betekent "opsomming".
    // Een enum lijst vormt een klasse (hierboven toegepast binnen de klasse Ingredient) waarmee we een lijst van afkortingen als constante waarden kunnen gebruiken.
    public enum Unit {
        GR("gram"),   // Afkorting voor gram
        PCS("stuks"), // Afkorting voor stuks
        SNF("snufjes"), // Afkorting voor snufjes
        KG("kilo"),   // Afkorting voor kilogrammen
        TS("theelepels"); // Afkorting voor theelepels


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


