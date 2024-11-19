public class Car {
    public String merk;
    public String type;
    public int bouwjaar;
    public String kleur;
    public double motorinhoud;


    public Car(String merk, String type, int bouwjaar, String kleur, double motorinhoud) {
this.merk = merk;
this.type = type;
this.bouwjaar = bouwjaar;
this.kleur = kleur;
this.motorinhoud = motorinhoud;
    }

    public String toString() {
        return "Deze " + this.merk + " " + this.type + " is " + this.kleur;
    }
}
