import java.util.Scanner;

public class EmployeeSalary {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.print("Enter Employee Name : ");
    String name = sc.nextLine();

    System.out.print("Enter Age : ");
    int age = sc.nextInt();

    sc.nextLine();
    System.out.print("Enter Designation : ");
    String desg = sc.nextLine();

    System.out.print("Enter Basic Monthly Salary : ");
    double basic = sc.nextDouble();

    System.out.print("Enter Total Working Days in Month : ");
    int totalDays = sc.nextInt();

    System.out.print("Enter Present Days : ");
    int present = sc.nextInt();

    int absent = totalDays - present;
    double dailySalary = basic / totalDays;
    double finalSalary = dailySalary * present;
    double deduction = basic - finalSalary;

    System.out.println("\n\n----------Output----------\n");        
    System.out.println("Employee Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Designation: " + desg);
    System.out.println("Present Days: " + present);
    System.out.println("Absent Days: " + absent);
    System.out.println("Final Salary: " + finalSalary);
    System.out.println("Deduction: " + deduction);

    sc.close();
}


}
