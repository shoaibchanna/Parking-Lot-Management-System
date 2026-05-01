package model;

import vehicle.Vehicle;

public class ParkingLot {

    private String name;
    private ParkingSpot[] spots;
    private int totalSpots;

    private static final double CAR_RATE = 50;
    private static final double BIKE_RATE = 20;
    private static final double TRUCK_RATE = 100;

    public ParkingLot(String name, int totalSpots) {
        this.name = name;
        this.totalSpots = totalSpots;

        spots = new ParkingSpot[totalSpots];

        for (int i = 0; i < totalSpots; i++) {
            spots[i] = new ParkingSpot(i + 1);
        }

        System.out.println("====================================");
        System.out.println("   " + name);
        System.out.println("   Total Spots: " + totalSpots);
        System.out.println("====================================\n");
    }

    public void parkVehicle(Vehicle v) {
        for (int i = 0; i < totalSpots; i++) {
            if (!spots[i].isOccupied()) {
                spots[i].park(v);

                System.out.println("\n===== PARKING SUCCESS =====");
                System.out.println("Spot Number : " + spots[i].getSpotId());
                v.displayInfo();
                System.out.println("Rate        : Rs." + getRate(v) + " / hour");
                System.out.println("===========================\n");

                return;
            }
        }
        System.out.println("\n Parking FULL\n");
    }

    public void unparkVehicle(int id, double hours) {

        if (id < 1 || id > totalSpots) {
            System.out.println("\n Invalid Spot ID\n");
            return;
        }

        ParkingSpot s = spots[id - 1];

        if (!s.isOccupied()) {
            System.out.println("\n Spot already empty\n");
            return;
        }

        Vehicle v = s.getVehicle();
        double fee = hours * getRate(v);

        s.leave();

        System.out.println("\n========= RECEIPT =========");
        System.out.println("Spot        : " + id);
        v.displayInfo();
        System.out.println("Hours       : " + hours);
        System.out.println("Rate        : Rs." + getRate(v));
        System.out.println("---------------------------");
        System.out.println("TOTAL FEE   : Rs." + fee);
        System.out.println("===========================\n");
    }

    private double getRate(Vehicle v) {
        if (v.getType().equals("Car")) return CAR_RATE;
        if (v.getType().equals("Bike")) return BIKE_RATE;
        return TRUCK_RATE;
    }

    public void displayStatus() {

        System.out.println("\n====== PARKING STATUS ======");
        System.out.println("Available: " + getAvailableCount() + "/" + totalSpots);
        System.out.println("----------------------------");

        for (int i = 0; i < totalSpots; i++) {
            spots[i].displayStatus();
        }

        System.out.println("----------------------------\n");
    }

    public int getAvailableCount() {
        int count = 0;
        for (int i = 0; i < totalSpots; i++) {
            if (!spots[i].isOccupied()) count++;
        }
        return count;
    }
}