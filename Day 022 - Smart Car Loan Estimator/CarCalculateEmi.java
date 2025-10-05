//import Scanner class here 
import java.util.Scanner;

public class CarCalculateEmi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Car EMI Calculator---\n");

        System.out.print("Enter the brand of car : ");
        String brandName = sc.nextLine();

        System.out.print("Enter the price of the car : ");
        double price = sc.nextDouble();

        System.out.print("Enter the time in Years : ");
        int time = sc.nextInt();

        System.out.print("Enter the Interest Rate (%) : ");
        float intrestRate = sc.nextFloat();

        double emi = 0;
        if (price > 0 && time > 0 && intrestRate >= 0) {
            
            emi = ((intrestRate / 100 * time * price) + price) / (time * 12);
        } else {
            System.err.println("You Entered Wrong Detail! Try Again!");
            System.exit(0);
        }

        System.out.println("\n\n---Details of EMI---");
        System.out.println("Car : " + brandName);
        System.out.println("Price : " + price);
        System.out.println("Years : " + time);
        System.out.println("EMI RS. : " + emi + " per month");
           System.out.println("---------------------");

        sc.close();
    }
}
