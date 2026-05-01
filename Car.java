package vehicle;

public class Car extends Vehicle {

    public Car(String licensePlate, String ownerName) {
        super(licensePlate, ownerName);
    }

    public String getType() {
        return "Car";
    }
}