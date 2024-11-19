package nl.novi.broker;

public class Address {


    public String street;
    public int number;
    private String city;
    public String zipcode;

    public Address() {

    }

    public void setCity(String denHaag) {
    }

    public Address( String zipcode, int number ) {

        this.zipcode = zipcode;
        this.number = number;
    }

    public Address( String street, int number, String city, String zipcode) {

        this.street = street;
        this.number = number;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String toString() {
        return " street: " + this.street + " nummer: " + this.number +   " city: " + this.city + " zipcode: " + this.zipcode;
    }


}