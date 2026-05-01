package vehicle;

public abstract class Vehicle {

    private String licensePlate;
    private String ownerName;

    public Vehicle(String licensePlate, String ownerName) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
    }

    public abstract String getType();

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void displayInfo() {
        System.out.println("Type        : " + getType());
        System.out.println("Owner       : " + ownerName);
        System.out.println("License No. : " + licensePlate);
    }
}