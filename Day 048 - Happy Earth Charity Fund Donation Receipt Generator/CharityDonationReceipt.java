import java.util.*;

public class CharityDonationReceipt {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("50_Days_Of_Java");
    System.out.println("Courier Delivery Charge Estimator\n");
    System.out.println("==============================================");
    System.out.println("        HAPPY EARTH CHARITY FUND");
    System.out.println("==============================================\n");

    System.out.print("Enter Donor Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Mobile Number: ");
    String mobile = sc.nextLine();

    System.out.print("Enter Email: ");
    String email = sc.nextLine();

    System.out.print("Enter Address: ");
    String address = sc.nextLine();

    System.out.print("Enter Donation Category (Education/Health/Food/Environment/Animal Care/Other): ");
    String category = sc.nextLine();

    System.out.print("Enter Payment Mode (UPI/Cash/CreditCard/DebitCard/NetBanking): ");
    String payment = sc.nextLine();

    System.out.print("Enter Donation Amount: ");
    double amount = sc.nextDouble();
    sc.nextLine();

    System.out.print("Enter Donation Date (DD-MM-YYYY): ");
    String date = sc.nextLine();

    System.out.println("\n\n=========== DONATION RECEIPT ===========");
    System.out.println("         HAPPY EARTH CHARITY FUND");
    System.out.println("========================================");
    System.out.println("Receipt Date: " + date);
    System.out.println("----------------------------------------");
    System.out.println("Donor Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Mobile Number: " + mobile);
    System.out.println("Email: " + email);
    System.out.println("Address: " + address);
    System.out.println("----------------------------------------");
    System.out.println("Donation Category: " + category);
    System.out.println("Payment Mode: " + payment);
    System.out.println("Donation Amount: " + amount + " Rs");
    System.out.println("----------------------------------------");
    System.out.println("Thank you " + name + " for your valuable contribution!");
    System.out.println("Your support helps us make the Earth a better place.");
    System.out.println("========================================");
    System.out.println("         HAPPY EARTH CHARITY FUND");
    System.out.println("========================================");
}


}
