import java.util.*;

public class BloodDonationEligibility {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("50_Days_Of_Java\n");
    System.out.print("Enter your name : ");
    String name = sc.nextLine().trim();

    System.out.print("Enter your age : ");
    int age = Integer.parseInt(sc.nextLine().trim());

    System.out.print("Enter your weight (kg) : ");
    int weight = Integer.parseInt(sc.nextLine().trim());

    System.out.print("Do you have any recent medical issues? (yes/no) : ");
    String medical = sc.nextLine().trim().toLowerCase();

    boolean eligible = true;
    String reason = "";

    if (age < 18 || age > 65) {
        eligible = false;
        reason = "your age is outside the required range";
    } else if (weight < 50) {
        eligible = false;
        reason = "your weight is below the minimum requirement";
    } else if (medical.equals("yes")) {
        eligible = false;
        reason = "you have recent medical issues";
    }

    if (eligible) {
        System.out.println("\nHello " + name + ", you are eligible to donate blood.\nThank you for helping others.");
    } else {
        System.out.println("Sorry " + name + ", you are not eligible to donate blood because " + reason + ".");
    }

    sc.close();
}


}
