package vehicle;

public class Bike extends Vehicle {

    public Bike(String licensePlate, String ownerName) {
        super(licensePlate, ownerName);
    }

    public String getType() {
        return "Bike";
    }
}