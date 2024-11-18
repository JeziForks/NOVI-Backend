import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Voer een getal in:");

        // Gebruik een int in plaats van double
        int getal = myObj.nextInt();
        if (getal % 2 != 0) {
            System.out.println("Dit is een oneven getal");
        } else {
            System.out.println("Dit is een even getal");
        }

        // Vergeet niet de scanner te sluiten om resource leaks te voorkomen
        myObj.close();
    }
}