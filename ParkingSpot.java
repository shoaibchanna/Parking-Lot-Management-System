package model;

import vehicle.Vehicle;

public class ParkingSpot {

    private int spotId;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(int spotId) {
        this.spotId = spotId;
        isOccupied = false;
        vehicle = null;
    }

    public void park(Vehicle v) {
        vehicle = v;
        isOccupied = true;
    }

    public Vehicle leave() {
        Vehicle v = vehicle;
        vehicle = null;
        isOccupied = false;
        return v;
    }

    public int getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void displayStatus() {
        if (isOccupied) {
            System.out.printf("| Spot %-2d | OCCUPIED | %-6s | Owner: %-10s |%n",
                spotId,
                vehicle.getType(),
                vehicle.getOwnerName());
        } else {
            System.out.printf("| Spot %-2d | FREE     |%n", spotId);
        }
    }
}