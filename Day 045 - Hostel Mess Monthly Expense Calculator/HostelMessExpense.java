import java.util.*;

class HostelMessExpense {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("50_Days_Of_Java");
    System.out.println("Hostel Mess Expense\n");
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Room Number: ");
    int room = sc.nextInt();

    System.out.print("Enter Number of Days Stayed: ");
    int days = sc.nextInt();

    System.out.print("Enter Breakfast Count per Day: ");
    int breakfast = sc.nextInt();

    System.out.print("Enter Lunch Count per Day: ");
    int lunch = sc.nextInt();

    System.out.print("Enter Dinner Count per Day: ");
    int dinner = sc.nextInt();

    int breakfastCost = breakfast * days * 30;
    int lunchCost = lunch * days * 60;
    int dinnerCost = dinner * days * 80;

    int grossAmount = breakfastCost + lunchCost + dinnerCost;

    double discount = 0;
    if (days > 25) {
        discount = grossAmount * 0.05;
    }

    double netPay = grossAmount - discount;

    System.out.println("\n--- Hostel Mess Monthly Bill ---");
    System.out.println("Student: " + name);
    System.out.println("Room: " + room);
    System.out.println("Days Stayed: " + days);
    System.out.println("Breakfast Total: " + breakfastCost);
    System.out.println("Lunch Total: " + lunchCost);
    System.out.println("Dinner Total: " + dinnerCost);
    System.out.println("Gross Amount: " + grossAmount);
    System.out.println("Discount: " + discount);
    System.out.println("Net Payable: " + netPay);
}


}
