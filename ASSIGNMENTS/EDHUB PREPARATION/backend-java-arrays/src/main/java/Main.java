public class Main {

    public static void main(String[] args) {
        String[] countdown = {"one", "two", "three"};
        String[] names = {"Sjaak", "Sjimmy", "Sjonny"};

        // implementeer de countdown met een array three...two...one... boom!
        System.out.println(countdown[2]);
        System.out.println(countdown[1]);
        System.out.println(countdown[0]);
        System.out.println("boom!");


        // implementeer een for loop die alle namen in de array "names" print. Houd er rekening mee dat de array een andere length kan hebben dan 3.
        for (int i = 0; i < names.length; ++i) {
            System.out.println(names[i]);

            // implementeer een for loop die de twee arrays combineert. De output moet zijn:
            // oneSjaak
            // twoSjimmy
            // threeSjonny



        }
        for (int i = 0; i< names.length; ++i) {
            System.out.println(countdown[i] + names[i]);
        }
    }
}
