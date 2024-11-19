# Opdrachtbeschrijving - Auto database

## Inleiding
Je gaat een class schrijven die we kunnen gebruiken om oneindig veel Auto-instanties te kunnen creëren. Zo kun je een mooie start maken met het aanmaken van classes, instanties en alle bijbehorende logica. Je kunt deze opdracht maken door het project te clonen of te downloaden naar jouw eigen computer via deze GitHub repository. De uitwerkingen staan op de branch _uitwerkingen_.

## Voor je begint

Je hebt IntelliJ IDEA en de JDK (Java Development Kit) versie 17 of hoger nodig - deze heb je beiden via de instructies op EdHub geïnstalleerd.

### 🟩 Code runnen (vanuit IntelliJ)
Klik op de groene play-knop voor de main-methode en kies 'Run...'.
### 🟨 Testen uitvoeren (vanuit IntelliJ)
Klik op de groene play-knop voor de MainTest-class in src/test/java en kies 'Run 'MainTest''.
### ⬛ Code runnen (met Maven)
Of, als je bekend bent met de terminal, kun je de applicatie runnen met:
```shell
./mvnw clean compile exec:java
```
of
```shell
mvnw.cmd clean compile exec:java
```

## Opdracht
Je gaat een blauwdruk maken van een Car-class, zodat je hier verschillende Car-instanties van kunt maken. Het eindresultaat moet voorzien zijn van de volgende specificaties:
* Een Car-class heeft de volgende velden, waarvan je zelf mag bedenken wat de bijbehorende types zijn:
  * het merk (zoals Volvo of Toyota),
  * het type (zoals Aygo of CX90),
  * het bouwjaar (zoals 2001 of 2020),
  * de kleur (zoals geel of rood)
  * en de motorinhoud (zoals 1.2 of 1.6).
* Bij het aanmaken van een Car-object, moeten direct alle bovenstaande gegevens van de auto worden meegegeven aan de constructor. Je zult de constructor dus zelf moeten schrijven.
* De Car-class heeft een methode die, wanneer je deze aanroept, een beschrijving in de terminal print: "Deze [merk] [type] is [kleur]". De daadwerkelijke inhoud van deze zin is dus afhankelijk van de Car-instantie waarop hij wordt aangeroepen.
* Je hebt minstens de volgende Car-instanties aangemaakt:
* Een groene Fiat 500 uit 2019 met een motorinhoud van 1.4;
* Een blauwe Toyota Aygo uit 2016 met een motorinhoud van 1.2;
* Een zwarte Volvo CX90 uit 2022 met een motorinhoud van 2.0;
* Je hebt alle Car-instanties in de terminal gelogd en op alle instanties de beschrijving-methode aangeroepen.

Om te valideren dat je klaar bent, kun je `testen` draaien. In `src/test/java` vind je een class met de naam `MainTest`. Links daarvan staat een groen pijltje die je kunt gebruiken om te compileren en te testen. Onderin het scherm komt het resultaat te staan. Zijn niet alle testen groen? Kijk dan goed naar de uitslag van de test om te zien wat er nog mist. Door aanpassingen te maken in de code, kun je ervoor zorgen dat de testen één voor één slagen! Let er op dat  de testen erg nauw luisteren, ook op hoofdletters en spaties.

### Stappenplan
_Let op_ het is uitdagender om jouw eigen stappenplan te maken, maar als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken:
1. Maak als eerst de class `src/main/java/Main.java` aan.
2. Zet in de Main class de methode `public static void main(String[] args)`.
3. Maak een nog een class aan in `src/main/java`. Noem deze class `Car` en zet er één property in voor het merk van de auto. Welk type moet deze variabele krijgen?
   _Tip_: declareer de variabele in het Engels.
4. Probeer eens uit of je een (lege) instantie kunt maken van jouw pas-gemaakte class. Dit doe je natuurlijk in het bestand `Main.java` in `src/main/java`. Print het merk-property van deze instantie in de terminal om te controleren of deze echt leeg is!  _Tip:_ System.out.println(instantie.property)
5. Run `StappenTest.nullTest()` om te zien of je applicatie tot nu toe doet wat er verwacht wordt.
6. Overschrijf de merk-property met de waarde "Volvo" (door de punt-notatie en de assignment operator te gebruiken) en print jouw het merk-property van jou instantie nu nogmaals. Je hebt nu twee print statements en je ziet nu ook twee woorden geprint staan in de terminal. Zie je daar nu de waarde bij staan?
7. Run `StappenTest.volvoTest()` om te zien of je applicatie tot nu toe doet wat er verwacht wordt.
8. Breid jouw class uit met alle gevraagde properties uit de opdracht-omschrijving;
9. Run `StappenTest.propertyTest()` om te zien of je applicatie tot nu toe doet wat er verwacht wordt.
10. Tijd om een constructor te maken in jouw class! Begin met een constructor die alleen het merk en type ontvangt en deze waardes naar de juiste velden in de class schrijft;
11. Verwijder nu jouw eerdere Car-instantie: deze werkt niet meer. Maak in plaats daarvan nu een nieuwe instantie, waar je direct de waardes "Volvo" en "CX90" aan meegeeft. Wanneer je de "merk" en "type" properties van deze instantie in de terminal print, zie je dan de juiste waarden staan?
12. Run `StappenTest.constructorTest()` om te zien of je applicatie tot nu toe doet wat er verwacht wordt.
13. Breidt de constructor nu uit door _alle_ velden uit de class direct te vullen. Test dit, door weer een nieuwe instantie te maken voor een blauwe Toyota Aygo uit 2016 met een motorinhoud van 1.2. Wanneer je de merk, type, bouwjaar, kleur en motorinhoud properties van deze instantie stuk voor stuk in de terminal print, zie je dan de juiste waarden staan?
14. Run `StappenTest.allArgsTest()` om te zien of je applicatie tot nu toe doet wat er verwacht wordt.
15. Maak nu nóg een instantie aan. Dit keer voor een groene Fiat 500 uit 2019 met een motorinhoud van 1.4.
16. Maak ook de derde instantie aan, een zwarte Volvo CX90 uit 2022 met motorinhoud 2.0.
17. Geef jouw Car-class nu een methode die, wanneer je deze aanroept, het merk, type en kleur van de Car-instantie in de terminal print. Bijvoorbeeld: "Deze Toyota Aygo is blauw." of "Deze Fiat 500 is groen". Roep deze methode aan op beide instanties in plaats van de losse print statements voor alle properties. Zie je de juiste waarde in de terminal staan?
18. Run `MainTest.mainTest()` om te zien of je applicatie tot nu toe doet wat er verwacht wordt.

_Tip:_ je roept een methode op een class als volgt aan:
```Java
    // Example.java
class Example {
  public void printThis() {
    System.out.println('PRINT ME');
  }
}
// Main.java
public class Main {
  public static void main(String[] args) {
    Example yourExample = new Example();
    yourExample.printThis();
  }
}
```

## Bonusopdracht

Geef de auto een extra veld genaamd "bestuurder" van type "Bestuurder".
Zorg dat een Bestuurder een naam en een rijbewijsnummer heeft.
Je mag zelf weten van welk type deze twee zijn.
