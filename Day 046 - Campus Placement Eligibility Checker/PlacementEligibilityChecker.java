import java.util.*;

class PlacementEligibilityChecker {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    System.out.println("50_Days_Of_Java");
    System.out.println("Placement Eligibility Checker\n");
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Branch: ");
    String branch = sc.nextLine();

    System.out.print("Enter CGPA: ");
    double cgpa = sc.nextDouble();

    System.out.print("Enter Number of Active Backlogs: ");
    int backlogs = sc.nextInt();

    System.out.print("Enter Total Skills Count: ");
    int skillCount = sc.nextInt();
    sc.nextLine();

    String[] skills = new String[skillCount];
    System.out.println("Enter Skills:");
    for (int i = 0; i < skillCount; i++) {
        skills[i] = sc.nextLine();
    }

    System.out.print("Enter Company Minimum CGPA: ");
    double compCGPA = sc.nextDouble();

    System.out.print("Enter Company Allowed Backlogs: ");
    int compBacklogs = sc.nextInt();

    System.out.print("Enter Required Skills Count: ");
    int compSkillReq = sc.nextInt();

    boolean isEligible = true;

    if (cgpa < compCGPA) {
        isEligible = false;
    }
    if (backlogs > compBacklogs) {
        isEligible = false;
    }
    if (skillCount < compSkillReq) {
        isEligible = false;
    }

    System.out.println("\n--- Placement Eligibility Report ---");
    System.out.println("Student: " + name);
    System.out.println("Branch: " + branch);
    System.out.println("CGPA: " + cgpa);
    System.out.println("Backlogs: " + backlogs);
    System.out.print("Skills: ");
    for (String s : skills) {
        System.out.print(s + " ");
    }

    if (isEligible) {
        System.out.println("\nStatus: Eligible for Placement");
        System.out.println("Message: You can apply for this company.");
    } else {
        System.out.println("\nStatus: Not Eligible");
        System.out.println("Message: Please work on improving your profile.");
    }
}


}

