import java.util.*;

class TrafficFineGenerator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    System.out.println("50_Days_Of_Java");
    System.out.println("Traffic Fine Generator\n");
    System.out.print("Enter Vehicle Number: ");
    String vehicleNumber = sc.nextLine();

    System.out.print("Enter Vehicle Type (Bike/Car/Auto/Truck): ");
    String vehicleType = sc.nextLine();

    System.out.println("Select Violation Type:");
    System.out.println("1. No Helmet");
    System.out.println("2. No Seatbelt");
    System.out.println("3. Signal Jump");
    System.out.println("4. Over Speed");
    System.out.println("5. Wrong Parking");
    System.out.println("6. No License");
    int choice = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Violation Date & Time: ");
    String dateTime = sc.nextLine();

    int fine = 0;
    String violation = "";

    switch (choice) {
        case 1:
            violation = "No Helmet";
            fine = 1000;
            break;
        case 2:
            violation = "No Seatbelt";
            fine = 1000;
            break;
        case 3:
            violation = "Signal Jump";
            fine = 2000;
            break;
        case 4:
            violation = "Over Speed";
            if (vehicleType.equalsIgnoreCase("Bike")) {
                fine = 1000;
            } else if (vehicleType.equalsIgnoreCase("Car")) {
                fine = 1500;
            } else {
                fine = 2000;
            }
            break;
        case 5:
            violation = "Wrong Parking";
            fine = 500;
            break;
        case 6:
            violation = "No License";
            fine = 5000;
            break;
        default:
            violation = "Invalid Option";
    }

    String message = "";
    if (fine < 2000) {
        message = "Please drive safely.";
    } else if (fine <= 4000) {
        message = "This is a serious violation.";
    } else {
        message = "Immediate attention required.";
    }

    System.out.println("\n--- Smart Traffic Fine Receipt ---");
    System.out.println("Vehicle Number: " + vehicleNumber);
    System.out.println("Vehicle Type: " + vehicleType);
    System.out.println("Violation: " + violation);
    System.out.println("Date & Time: " + dateTime);
    System.out.println("Total Fine: " + fine);
    System.out.println("Message: " + message);
}


}
