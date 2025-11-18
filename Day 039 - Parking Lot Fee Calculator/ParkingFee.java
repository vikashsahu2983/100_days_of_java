import java.util.Scanner;

public class ParkingFee {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("50_Days_Of_Java\n");
    System.out.print("Enter vehicle type (Car/Bike/Auto) : ");
    String type = sc.next();

    System.out.print("Enter vehicle number : ");
    String number = sc.next();

    System.out.print("Enter entry time (hour in 24-hour format) : ");
    int entry = sc.nextInt();

    System.out.print("Enter exit time (hour in 24-hour format) : ");
    int exit = sc.nextInt();

    int duration = exit - entry;
    int rate = 0;

    if (type.equalsIgnoreCase("Car")) {
        rate = 30;
    } else if (type.equalsIgnoreCase("Bike")) {
        rate = 15;
    } else if (type.equalsIgnoreCase("Auto")) {
        rate = 20;
    }

    int fee = duration * rate;
    System.out.println("\n\n---------Parking Bill---------");
    System.out.println("Vehicle Type: " + type);
    System.out.println("Vehicle Number: " + number);
    System.out.println("Entry Time: " + entry + ":00");
    System.out.println("Exit Time: " + exit + ":00");
    System.out.println("Total Time Parked: " + duration + " hours");
    System.out.println("Parking Fee: " + fee);
}


}
