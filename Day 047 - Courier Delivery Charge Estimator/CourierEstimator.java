import java.util.*;

public class CourierEstimator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    System.out.println("50_Days_Of_Java");
    System.out.println("Courier Delivery Charge Estimator\n");
    System.out.print("Enter Sender Name: ");
    String sender = sc.nextLine();

    System.out.print("Enter Receiver Name: ");
    String receiver = sc.nextLine();

    System.out.print("Enter Package Weight (kg): ");
    double weight = sc.nextDouble();

    System.out.print("Enter Delivery Distance (km): ");
    double distance = sc.nextDouble();
    sc.nextLine();

    System.out.print("Enter Delivery Speed (Normal/Express/Super Express): ");
    String speed = sc.nextLine();

    System.out.print("Enter Package Type (Documents/Electronics/Fragile/Others): ");
    String type = sc.nextLine();

    System.out.print("Is Insurance Required? (Yes/No): ");
    String insurance = sc.nextLine();

    System.out.print("Is COD Required? (Yes/No): ");
    String cod = sc.nextLine();

    double weightCharge = 0;

    if (weight <= 5) {
        weightCharge = weight * 20;
    } else if (weight <= 20) {
        weightCharge = weight * 15;
    } else {
        weightCharge = weight * 10;
    }

    double distanceCharge = distance * 5;

    double speedCharge = 0;
    if (speed.equalsIgnoreCase("Express")) {
        speedCharge = 50;
    } else if (speed.equalsIgnoreCase("Super Express")) {
        speedCharge = 100;
    }

    double typeCharge = 0;
    if (type.equalsIgnoreCase("Electronics")) {
        typeCharge = 50;
    } else if (type.equalsIgnoreCase("Fragile")) {
        typeCharge = 100;
    } else if (type.equalsIgnoreCase("Others")) {
        typeCharge = 20;
    }

    double insuranceCharge = 0;
    if (insurance.equalsIgnoreCase("Yes")) {
        insuranceCharge = 0.02 * (weightCharge + distanceCharge);
    }

    double codCharge = 0;
    if (cod.equalsIgnoreCase("Yes")) {
        codCharge = 30;
    }

    double total = weightCharge + distanceCharge + speedCharge + typeCharge + insuranceCharge + codCharge;

    System.out.println("\n----- Courier Delivery Summary -----");
    System.out.println("Sender: " + sender);
    System.out.println("Receiver: " + receiver);
    System.out.println("Weight Charge: " + weightCharge + " Rs");
    System.out.println("Distance Charge: " + distanceCharge + " Rs");
    System.out.println("Speed Charge: " + speedCharge + " Rs");
    System.out.println("Package Type Charge: " + typeCharge + " Rs");
    System.out.println("Insurance Charge: " + insuranceCharge + " Rs");
    System.out.println("COD Charge: " + codCharge + " Rs");
    System.out.println("Total Courier Charge: " + total + " Rs");
}


}
