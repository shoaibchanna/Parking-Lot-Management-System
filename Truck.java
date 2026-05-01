package vehicle;

public class Truck extends Vehicle {

    public Truck(String licensePlate, String ownerName) {
        super(licensePlate, ownerName);
    }

    public String getType() {
        return "Truck";
    }
}