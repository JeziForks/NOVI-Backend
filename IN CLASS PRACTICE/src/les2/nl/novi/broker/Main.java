package les2.nl.novi.broker;


  public class Main {
    public static void main(String[] args) {
      Address a1 = new Address("WCL", 106, "Rijswijk","2282JG");
      System.out.println("a1 = " + a1);

      Address a2 = new Address("2513BM", 10);
      a2.setCity("Den Haag");

      Address a3 = new Address();
      System.out.println("a3 = " + a3);

      House house1 = new House(a3, (short) 5, 354_000);
      System.out.println("house1 = " + house1);
    }
  }
