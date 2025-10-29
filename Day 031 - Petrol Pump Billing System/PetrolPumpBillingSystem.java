import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PetrolPumpBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("100_Days_Of_Java\n");

        System.out.println("===== WELCOME TO PETROL PUMP BILLING SYSTEM =====");
        System.out.print("Enter Petrol Pump Name: ");
        String pumpName = sc.nextLine();

        System.out.print("Enter number of liters: ");
        double liters = sc.nextDouble();

        System.out.print("Enter price per liter (RS.): ");
        double pricePerLiter = sc.nextDouble();

        double total = liters * pricePerLiter;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(formatter);

        System.out.println("\n----------- RECEIPT -----------");
        System.out.println("Petrol Pump: " + pumpName);
        System.out.println("Date & Time: " + dateTime);
        System.out.println("-------------------------------");
        System.out.printf("Liters: %.2f L\n", liters);
        System.out.printf("Price per Liter: ₹%.2f\n", pricePerLiter);
        System.out.println("-------------------------------");
        System.out.printf("Total Amount: ₹%.2f\n", total);
        System.out.println("-------------------------------");
        System.out.println("Thank you! Drive Safe!");
        System.out.println("-------------------------------");

        sc.close();
    }
}

