import java.util.*;

public class EventCertificateGenerator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("50_Days_Of_Java");
    System.out.println("College Event Participation Certificate Generator\n");
    System.out.println("==============================================");
    System.out.println("            COLLEGE OF ENGINEERING");
    System.out.println("       EVENT PARTICIPATION CERTIFICATE");
    System.out.println("==============================================\n");

    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Roll Number: ");
    String roll = sc.nextLine();

    System.out.print("Enter Course/Department: ");
    String course = sc.nextLine();

    System.out.print("Enter Year/Semester: ");
    String year = sc.nextLine();

    System.out.print("Enter Event Name: ");
    String event = sc.nextLine();

    System.out.print("Enter Event Date (DD-MM-YYYY): ");
    String eventDate = sc.nextLine();

    System.out.print("Enter Event Venue: ");
    String venue = sc.nextLine();

    System.out.print("Enter Organizer Name: ");
    String organizer = sc.nextLine();

    System.out.print("Enter Faculty Coordinator Name: ");
    String faculty = sc.nextLine();

    System.out.print("Enter Certificate Issue Date: ");
    String issueDate = sc.nextLine();

    System.out.println("\n\n================= PARTICIPATION CERTIFICATE =================");
    System.out.println("                      College of Engineering\n");

    System.out.println("This is to certify that " + name + " (Roll No: " + roll + ")");
    System.out.println("from " + course + ", " + year + " has successfully participated in");
    System.out.println("the event \"" + event + "\" held on " + eventDate + " at " + venue + ".\n");

    System.out.println("Organized by: " + organizer);
    System.out.println("Faculty Coordinator: " + faculty + "\n");

    System.out.println("Certificate Issued On: " + issueDate + "\n");

    System.out.println("Thank you for your participation.");
    System.out.println("===============================================================");
}


}
