import java.util.Scanner;

public class TollTaxBillingSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    System.out.println("50_Days_Of_Java");
    System.out.println("Toll Tax Billing System\n");

    
    System.out.print("Enter Vehicle Number: ");
    String vehicleNumber = sc.nextLine();

    System.out.print("Enter Vehicle Type (Car / Truck / Bus / Bike): ");
    String vehicleType = sc.nextLine();

    System.out.print("Enter Distance Travelled in KM: ");
    double distance = sc.nextDouble();

    double ratePerKm;

    if (vehicleType.equalsIgnoreCase("Car")) {
        ratePerKm = 2.5;
    } else if (vehicleType.equalsIgnoreCase("Truck")) {
        ratePerKm = 5.0;
    } else if (vehicleType.equalsIgnoreCase("Bus")) {
        ratePerKm = 4.0;
    } else if (vehicleType.equalsIgnoreCase("Bike")) {
        ratePerKm = 1.0;
    } else {
        System.out.println("Invalid vehicle type. Billing failed.");
        return;
    }

    double totalToll = distance * ratePerKm;

    System.out.println("\n----- Toll Tax Receipt -----");
    System.out.println("Vehicle Number: " + vehicleNumber);
    System.out.println("Vehicle Type: " + vehicleType);
    System.out.println("Distance Travelled: " + distance + " KM");
    System.out.println("Rate Per KM: " + ratePerKm);
    System.out.println("Total Toll Amount: Rs " + totalToll);
}


}
