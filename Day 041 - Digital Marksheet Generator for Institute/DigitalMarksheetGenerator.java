import java.util.Scanner;

public class DigitalMarksheetGenerator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("50_Days_Of_Java");
    System.out.println("Digital Marksheet Generator for Institute\n");
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Class: ");
    String studentClass = sc.nextLine();

    System.out.print("Enter Date of Birth (DD-MM-YYYY): ");
    String dob = sc.nextLine();

    System.out.print("Enter Roll Number: ");
    String roll = sc.nextLine();

    System.out.print("Enter Father's Name: ");
    String father = sc.nextLine();

    System.out.print("Enter Mother's Name: ");
    String mother = sc.nextLine();

    System.out.print("Enter Address: ");
    String address = sc.nextLine();

    System.out.print("Enter Mobile Number: ");
    String mobile = sc.nextLine();

    System.out.print("Enter Number of Subjects: ");
    int subjectCount = sc.nextInt();
    sc.nextLine();

    String[] subjects = new String[subjectCount];
    int[] marks = new int[subjectCount];

    for (int i = 0; i < subjectCount; i++) {
        System.out.print("Enter Subject " + (i + 1) + " Name: ");
        subjects[i] = sc.nextLine();

        System.out.print("Enter Marks for " + subjects[i] + ": ");
        marks[i] = sc.nextInt();
        sc.nextLine();
    }

    int total = 0;
    for (int m : marks) {
        total += m;
    }

    double percentage = (double) total / subjectCount;

    String grade;
    if (percentage >= 90) {
        grade = "A+";
    } else if (percentage >= 80) {
        grade = "A";
    } else if (percentage >= 70) {
        grade = "B";
    } else if (percentage >= 60) {
        grade = "C";
    } else if (percentage >= 50) {
        grade = "D";
    } else {
        grade = "Fail";
    }

    String status = percentage >= 50 ? "Promoted" : "Not Promoted";

    System.out.println("\n----- DIGITAL MARKSHEET -----");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Class: " + studentClass);
    System.out.println("DOB: " + dob);
    System.out.println("Roll Number: " + roll);
    System.out.println("Father's Name: " + father);
    System.out.println("Mother's Name: " + mother);
    System.out.println("Address: " + address);
    System.out.println("Mobile: " + mobile);

    System.out.println("\nSubjects and Marks:");
    for (int i = 0; i < subjectCount; i++) {
        System.out.println(subjects[i] + ": " + marks[i]);
    }

    System.out.println("\nTotal Marks: " + total);
    System.out.println("Percentage: " + percentage + "%");
    System.out.println("Grade: " + grade);
    System.out.println("Status: " + status);
}


}
