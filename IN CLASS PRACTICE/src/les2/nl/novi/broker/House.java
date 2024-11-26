package les2.nl.novi.broker;

public class House {
    private Address address;
    private short numberofRooms;
    private int price;

    public House(Address address, short numberofRooms, int price) {
        this.address = address;
        this.numberofRooms = numberofRooms;
        this.price = price;
    }
}
