import java.util.Scanner;
public class ElectricityLoad {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("50_Days_Of_Java\n");
    System.out.print("Enter number of appliances : ");
    int n = sc.nextInt();
    System.out.println();
    int totalWatts = 0; 

    for (int i = 1; i <= n; i++) {
        System.out.print("Enter wattage of appliance" + i+" : ");
        int watt = sc.nextInt();
        totalWatts = totalWatts + watt;
    }

    double totalKW = totalWatts / 1000.0;

    System.out.println("-----output-----\n\nTotal Load: " + totalWatts + " watts");
    System.out.println("Total Load in kW: " + totalKW + " kW");

    if (totalKW <= 5) {
        System.out.println("Category: Domestic Low Load");
    } else {
        System.out.println("Category: High Load");
    }
}


}
