# Opdrachtbeschrijving - Lost Variables

## Inleiding

De ontwikkelaar van dit Java-programma is halverwege het programmeren een broodje pindakaas gaan smeren en kwam daarna nooit meer terug. Wanneer je de code probeert te runnen, zal de compiler een lijst aan foutmeldingen laten zien. Daarom hebben we jouw hulp nodig om de code af te maken!

In de `Main`-class staan een hoop `System.out.println`-statements, maar alle variabelen die geprint moeten worden zijn rood gekleurd. Dat komt omdat deze variabelen nog niet zijn gedeclareerd. Gelukkig heeft de ontwikkelaar wat hints achtergelaten en een aantal testen geschreven voor dit programma die je helpen de verloren variabelen te declareren. 

Je kunt deze opdracht maken door het project te clonen of te downloaden naar jouw eigen computer via deze GitHub repository. De uitwerkingen staan op de branch _uitwerkingen_.

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

Zorg dat de juiste variabelen worden gedeclareerd in de `main`-class in `src/main/java`, zodat de code gecompileerd kan worden. Gebruik hiervoor de hints die als commentaar achter de `System.out.println`-regels staan.

**Let op:** je mag de regels die starten met `System.out.println` niet aanpassen.

Om te valideren dat je klaar bent, kun je de testen draaien. In `src/test/java` vind je een class met de naam `MainTest`. Links daarvan staat een groen pijltje die je kunt gebruiken om te compileren en te testen. Onderin het scherm komt het resultaat te staan. Zijn niet alle testen groen? Kijk dan goed naar de uitslag van de test om te zien wat er nog mist. Door aanpassingen te maken in de code, kun je ervoor zorgen dat de testen één voor één slagen!

### Stappenplan

_Let op_ het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken

1. Open het bestand `Main.java` in `src/main/java`;
2. Kijk goed naar het voorbeeld, hier zie je dat er een variabele wordt gedeclareerd van type `String` met naam `string_voorbeeld`. Daarna volgt een `=` waardoor we direct een waarde toewijzen, namelijk de string `"Dit is een voorbeeld"`. Je sluit het statement af met `;`
3. Declareer onder het voorbeeld een nieuwe variabele van type  `String` met de naam `string_hello_world`
4. Zet na de declaratie een `=` om direct een waarde toe te wijzen.
5. Wijs de String `"hello world"` toe, en sluit af met een `;`
6. De regel `System.out.println(string_hello_world);` bevat nu geen foutmelding meer,
7. Declareer op een nieuwe regel een nieuwe variabele van type  `boolean` met de naam `boolean_true`
8. Zet na de declaratie een `=` om direct een waarde toe te wijzen.
9. Wijs de boolean `true` toe, en sluit af met een `;`

## Bonusopdracht

Het onderste `System.out.println` statement vraagt je om een variable opnieuw toe te wijzen. Op welke plek in de code doe je dit?
Hoe ziet alleen toewijzen er uit? (Hint: de variabele bestaat al, dus we hoeven hem niet te declareren.)
