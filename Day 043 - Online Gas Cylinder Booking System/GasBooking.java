import java.util.*;

class GasBooking {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("100_Days_Of_Java");
    System.out.println("Online Gas Cylinder Booking System\n");
    System.out.print("Enter Customer Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Mobile Number: ");
    String mobile = sc.nextLine();

    System.out.print("Enter Address: ");
    String address = sc.nextLine();

    System.out.print("Enter Gas Agency Name: ");
    String agency = sc.nextLine();

    System.out.print("Enter Cylinder Type (Domestic/Commercial): ");
    String type = sc.nextLine();

    System.out.print("Enter Number of Cylinders: ");
    int cylinders = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Preferred Delivery Date: ");
    String date = sc.nextLine();

    System.out.print("Do you want Additional Service? (Yes/No): ");
    String service = sc.nextLine();

    int serviceCharge = 0;
    if (service.equalsIgnoreCase("Yes")) {
        serviceCharge = 50;
    }

    int cylinderPrice = 0;
    if (type.equalsIgnoreCase("Domestic")) {
        cylinderPrice = 950;
    } else if (type.equalsIgnoreCase("Commercial")) {
        cylinderPrice = 1500;
    }

    int totalCylinderCost = cylinders * cylinderPrice;

    int deliveryCharge;
    if (cylinders > 2) {
        deliveryCharge = 70;
    } else {
        deliveryCharge = 40;
    }

    double beforeGST = totalCylinderCost + serviceCharge + deliveryCharge;
    double gst = beforeGST * 0.05;
    double finalAmount = beforeGST + gst;

    System.out.println("\n---------- GAS CYLINDER BOOKING RECEIPT ----------");
    System.out.println("Customer Name: " + name);
    System.out.println("Mobile Number: " + mobile);
    System.out.println("Address: " + address);
    System.out.println("Gas Agency: " + agency);
    System.out.println("Cylinder Type: " + type);

    System.out.println("\nNumber of Cylinders: " + cylinders);
    System.out.println("Total Cylinder Cost: " + totalCylinderCost);
    System.out.println("Service Charge: " + serviceCharge);
    System.out.println("Delivery Charge: " + deliveryCharge);
    System.out.println("GST (5%): " + gst);
    System.out.println("Final Amount: " + finalAmount);
    System.out.println("Booking Status: Booking Confirmed");
}


}
