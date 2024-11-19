public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Aygo", 2016, "blauw", 1.2);
        Car myCar2 = new Car("Fiat", "500", 2019, "groen", 1.4);
        Car myCar3 = new Car("Volvo", "CX90", 2022, "zwart", 2.0);
//        Car myCar4 = new Car("Golf", "Cabrio", 2000, "donkerblauw", 2.0);

        // Print elk object afzonderlijk
        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
//        System.out.println(myCar4);

        }
    }



/*// Voeg alle auto's toe aan een array
Car[] cars = {myCar1, myCar2, myCar3, myCar4};
// Gebruik een for-loop om alle auto's te printen
        for (Car car : cars) {
        System.out.println(car);*/


/*

DEZE OPTIE IS EFFICIËNTER
    import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            // Maak een lijst om auto's op te slaan
            ArrayList<Car> cars = new ArrayList<>();

            // Voeg de auto's toe aan de lijst
            cars.add(new Car("Fiat", "500", 2019, "groen", 1.4));
            cars.add(new Car("Toyota", "Aygo", 2016, "blauwe", 1.2));
            cars.add(new Car("Volvo", "XC90", 2022, "zwarte", 2.0));
            cars.add(new Car("Fiat", "500", 2019, "groen", 1.4));
            cars.add(new Car("Fiat", "500", 2019, "groen", 1.4));

            // Gebruik een for-loop om alle auto's te printen
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }*/




