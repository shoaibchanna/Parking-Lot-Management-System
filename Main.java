import java.util.Scanner;

import vehicle.*;
import model.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot("City Parking System", 5);

        int choice = 0;

        while (choice != 4) {

            System.out.println("========== MAIN MENU ==========");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Unpark Vehicle");
            System.out.println("3. View Status");
            System.out.println("4. Exit");
            System.out.println("================================");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {

                System.out.println("\nSelect Vehicle Type");
                System.out.println("1. Car   (Rs.50/hr)");
                System.out.println("2. Bike  (Rs.20/hr)");
                System.out.println("3. Truck (Rs.100/hr)");
                System.out.print("Choice: ");

                int t = Integer.parseInt(sc.nextLine());

                System.out.print("Owner Name   : ");
                String o = sc.nextLine();

                System.out.print("License Plate: ");
                String p = sc.nextLine();

                Vehicle v;

                if (t == 1) v = new Car(p, o);
                else if (t == 2) v = new Bike(p, o);
                else v = new Truck(p, o);

                lot.parkVehicle(v);
            }

            else if (choice == 2) {

                System.out.print("\nEnter Spot ID: ");
                int id = Integer.parseInt(sc.nextLine());

                System.out.print("Enter Hours  : ");
                double h = Double.parseDouble(sc.nextLine());

                lot.unparkVehicle(id, h);
            }

            else if (choice == 3) {
                lot.displayStatus();
            }

            else if (choice == 4) {
                System.out.println("\nThank you! Exiting...\n");
            }

            else {
                System.out.println("\nInvalid choice!\n");
            }
        }
    }
}