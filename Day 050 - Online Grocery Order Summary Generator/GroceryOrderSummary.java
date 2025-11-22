    
    import java.util.*;

public class GroceryOrderSummary {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("50_Days_Of_Java");
    System.out.println("Online Grocery Order Summary Generator\n");
    System.out.println("===============================================");
    System.out.println("        ONLINE GROCERY ORDER SUMMARY");
    System.out.println("===============================================\n");

    System.out.print("Enter Customer Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Mobile Number: ");
    String mobile = sc.nextLine();

    System.out.print("Enter Delivery Address: ");
    String address = sc.nextLine();

    System.out.print("Enter Number of Items: ");
    int count = sc.nextInt();
    sc.nextLine();

    String[] itemNames = new String[count];
    int[] quantities = new int[count];
    double[] prices = new double[count];
    double[] totals = new double[count];

    double grandTotal = 0;

    for (int i = 0; i < count; i++) {
        System.out.println("\nEnter details for Item " + (i + 1));

        System.out.print("Item Name: ");
        itemNames[i] = sc.nextLine();

        System.out.print("Quantity: ");
        quantities[i] = sc.nextInt();

        System.out.print("Price per unit: ");
        prices[i] = sc.nextDouble();
        sc.nextLine();

        totals[i] = quantities[i] * prices[i];
        grandTotal += totals[i];
    }

    System.out.print("\nEnter Delivery Charge: ");
    double delivery = sc.nextDouble();
    sc.nextLine();

    System.out.print("Enter Payment Mode (UPI/Cash on Delivery/Net Banking/Card Payment): ");
    String paymentMode = sc.nextLine();

    double finalAmount = grandTotal + delivery;

    System.out.println("\n\n================= ORDER SUMMARY =================");
    System.out.println("Customer: " + name);
    System.out.println("Mobile: " + mobile);
    System.out.println("Address: " + address + "\n");

    System.out.println("Items Ordered:");
    for (int i = 0; i < count; i++) {
        System.out.println((i + 1) + ". " + itemNames[i] + " Qty " + quantities[i] + " MRP " + prices[i] + " TOTAL PRICE " + totals[i]);
    }

    System.out.println("\nTotal Item Cost: " + grandTotal);
    System.out.println("Delivery Charge: " + delivery);
    System.out.println("Final Payable Amount: " + finalAmount + "\n");

    System.out.println("Payment Mode: " + paymentMode);
    System.out.println("Thank you for shopping with us!");
    System.out.println("===================================================");
}


}
