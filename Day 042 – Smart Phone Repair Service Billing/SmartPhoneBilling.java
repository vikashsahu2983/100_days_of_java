import java.util.*;

class SmartPhoneBilling {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    
    System.out.println("100_Days_Of_Java");
    System.out.println("Smart Phone Repair Service Billing\n");
    System.out.print("Enter Customer Name: ");
    String customer = sc.nextLine();

    System.out.print("Enter Mobile Number: ");
    String mobile = sc.nextLine();

    System.out.print("Enter Phone Brand: ");
    String brand = sc.nextLine();

    System.out.print("Enter Model Name: ");
    String model = sc.nextLine();

    System.out.print("Enter IMEI Number: ");
    String imei = sc.nextLine();

    System.out.print("Enter Problem Type: ");
    String problem = sc.nextLine();

    System.out.print("Enter Estimated Repair Time (hrs): ");
    int time = sc.nextInt();

    System.out.print("Enter Number of Parts Replaced: ");
    int n = sc.nextInt();
    sc.nextLine();

    String[] partName = new String[n];
    int[] partPrice = new int[n];

    int totalPartsCost = 0;

    for (int i = 0; i < n; i++) {
        System.out.print("Enter Part " + (i + 1) + " Name: ");
        partName[i] = sc.nextLine();

        System.out.print("Enter Part " + (i + 1) + " Price: ");
        partPrice[i] = sc.nextInt();
        sc.nextLine();

        totalPartsCost += partPrice[i];
    }

    int labourCharge;
    if (time <= 2) {
        labourCharge = 300;
    } else if (time <= 5) {
        labourCharge = 500;
    } else {
        labourCharge = 800;
    }

    double gst = (totalPartsCost + labourCharge) * 0.18;
    double finalAmount = totalPartsCost + labourCharge + gst;

    System.out.println("\n---------- SMART PHONE REPAIR BILL ----------");
    System.out.println("Customer Name: " + customer);
    System.out.println("Mobile Number: " + mobile);
    System.out.println("Phone: " + brand + " " + model);
    System.out.println("IMEI: " + imei);
    System.out.println("Problem: " + problem);

    System.out.println("\nParts Used:");
    for (int i = 0; i < n; i++) {
        System.out.println((i + 1) + ". " + partName[i] + " - " + partPrice[i]);
    }

    System.out.println("Total Parts Cost: " + totalPartsCost);
    System.out.println("Labour Charge: " + labourCharge);
    System.out.println("GST (18%): " + gst);
    System.out.println("Final Bill Amount: " + finalAmount);
    System.out.println("Status: Ready for Delivery");
}


}
