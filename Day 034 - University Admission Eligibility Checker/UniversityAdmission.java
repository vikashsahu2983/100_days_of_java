import java.util.Scanner;

public class UniversityAdmission {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("Enter Student Name:");
    String name = sc.nextLine();

    System.out.println("Enter 12th Percentage:");
    double perc = sc.nextDouble();

    System.out.println("Enter Entrance Exam Score:");
    double score = sc.nextDouble();

    sc.nextLine();
    System.out.println("Enter Category (General/OBC/SC/ST):");
    String cat = sc.nextLine();

    double required = 60;

    if(cat.equalsIgnoreCase("OBC")) {
        required = 55;
    } else if(cat.equalsIgnoreCase("SC")) {
        required = 50;
    } else if(cat.equalsIgnoreCase("ST")) {
        required = 45;
    }

    if(perc >= required && score >= 50) {
        System.out.println("Student Name: " + name);
        System.out.println("Status: Eligible");
        System.out.println("Reason: Meets all criteria");
    } else {
        System.out.println("Student Name: " + name);
        System.out.println("Status: Not Eligible");

        if(perc < required && score < 50) {
            System.out.println("Reason: Both percentage and exam score are low");
        } else if(perc < required) {
            System.out.println("Reason: 12th percentage is less than required");
        } else {
            System.out.println("Reason: Entrance exam score is low");
        }
    }
}
}
