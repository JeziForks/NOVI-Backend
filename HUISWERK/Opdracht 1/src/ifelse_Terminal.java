/*Opdracht 1: Even/Odd Checker
Schrijf een methode dat als input een getal van de gebruiker accepteert en controleert of het even of oneven is. Print "Het getal is even" of "Het getal is oneven".*/

import java.util.Scanner;
//Met de Scanner class kan je de gebruiker een input laten geven.
//Dit maakt de code interessanter.

public class ifelse_Terminal {

    public static void main(String[] args) {
        //      ### Benaming is vergelijkbaar met function Myfunction. Dit object kunnen we hergebruiken
        Scanner scanner = new Scanner(System.in);

        // Opdracht 1: Even/Odd Checker
        performEvenOddCheck(scanner);

        // Opdracht 2: Grader
        performECTSGrading(scanner);

        // Opdracht 3: Grootste Getal
        checkBiggestNumber(scanner);

        // Scanner sluiten om resource leaks te voorkomen
        scanner.close();
    }

    // Methode voor Even/Odd Checker
    public static void performEvenOddCheck(Scanner scanner) {
        System.out.println("Voer een geheel getal in voor even/oneven check:");

        double grade = 0;

        // ### Onderstaande nested if in while loop komt van chatgpt, maar geeft wel een noodzakelijke afdekking van verkeerde invoer met gebruik van user input.
        // ### Ook goed om in te zien dat hier geen regex nodig is en simpelweg door nested if in een while(true) loop en een break kan worden afgehandeld ###


        while (true) {
            if (scanner.hasNextInt()) {
                // Het getal is een geldig int type
                // ### Opgezocht: In Java, de methode .nextInt() behoort tot de Scanner klasse en wordt gebruikt om de volgende getal ingave van het type int uit de invoerstroom te lezen. ###
                grade = scanner.nextInt();

                // Controleer nu of het getal even of oneven is
                if (grade % 2 == 0) {
                    System.out.println("Het getal is even.");
                } else {
                    System.out.println("Het getal is oneven.");
                }
                break; // Stop de lus zodra een geldig getal is ingevoerd en verwerkt
            } else {
                // De invoer is geen geldig int type (bijv. float, string, etc.)
                String invalidInput = scanner.next();
                System.out.println("'" + invalidInput + "' is geen geldig geheel getal. Probeer het opnieuw:");
            }
        }
    }

    /* Opdracht 2: Grader
     Schrijf een methode dat een cijfer van een student accepteert (tussen 1 en 10) en op basis van dat cijfer een bijbehorende letterwaarde toekent (A, B, C, D, F). Je mag googlen naar het juiste cijferbereik voor elke letterwaarde, maar je mag het ook gokken */

    // Methode voor Grader
    public static void performECTSGrading(Scanner scanner) {

        System.out.println("Voer een cijfer in (tussen 1 en 10):");

        double grade = -1;
        while (grade < 1 || grade > 10) { // Herhaal zolang het cijfer buiten het bereik ligt
            if (scanner.hasNextDouble()) {
                grade = scanner.nextDouble();
                if (grade < 1 || grade > 10) {
                    System.out.println("Het cijfer moet tussen 1 en 10 liggen. Probeer het opnieuw:");
                }
            } else {
                System.out.println("Dat is geen geldig cijfer. Probeer het opnieuw:");
                scanner.next(); // Ongeldige invoer negeren
            }
        }

        // Beoordeel het cijfer
        String assessment = determineAssessment(grade);
        System.out.println("Je score is: " + assessment);
    }


    // Methode om beoordeling te bepalen. Hier geen void want er wordt iets (de ECTS** grade) gereturned wat gebruikt moet worden in Methode voor Grader.
    public static String determineAssessment(double grade) {
        if (grade > 0 && grade < 6) {
            return "F";
        } else if (grade >= 6 && grade < 6.5) {
            return "E";
        } else if (grade >= 6.5 && grade < 7.5) {
            return "D";
        } else if (grade >= 7.5 && grade < 8) {
            return "C";
        } else if (grade >= 8 && grade <= 8.5) {
            return "B";
        } else if (grade >= 8.5 && grade <= 10) {
            return "A";
        } else {
            return "Invalid score";
        }
    }


/*
    De volgende optie is een stuk leesbaarder:
    // Methode om beoordeling te bepalen
    public static String determineAssessment(double grade) {
        int roundedGrade = (int) Math.floor(grade);

        switch (roundedGrade) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "F";
            case 5:
                return "D";
            case 6:
            case 7:
                return "C";
            case 8:
                return "B";
            case 9:
            case 10:
                return "A";
            default:
                return "Invalid score";
        }
    }
*/


/*Opdracht 3: Grootste van Twee Getallen
Schrijf een programma dat de grootste van twee ingevoerde getallen bepaalt.*/


    //Invoer voor vegelijking en checken of de getallen valid zijn
    public static void checkBiggestNumber(Scanner scanner) {

        System.out.println("Voer 2 getallen na elkaar in om te zien wat de hoogste is");

        // Geïnitieerd met array
        int[] numbers = new int[2]; // Array om de getallen op te slaan


        for (int i = 0; i < 2; ) {

//            print in plaats van println, omdat je hier wilt ddat dezelfde lijn wordt aangehouden
            System.out.print("Voer getal " + (i + 1) + " in: ");

            if (scanner.hasNextInt()) {

                if (scanner.hasNextInt())
                    numbers[0] = scanner.nextInt();
                else {
                    numbers[1] = scanner.nextInt();

                }
                i++;

            } else {
                System.out.println("Dit is geen geldige waarde");
                scanner.next();
            }

        }
        int Biggestresult = findBiggestNumber(numbers[0], numbers[1]);
        System.out.println("Het grootste getal is " + Biggestresult);
    }

    //de daadwerkelijke methode om de getallen te vergelijken

    public static int findBiggestNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

/* Kan cleaner met een ternary operator:

public static int findBiggestNumber(int x, int y) {
            return (x > y) ? x : y; // Ternary operator om het grootste getal te bepalen
        }*/

    }

}


