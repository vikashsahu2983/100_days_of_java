import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreditCardEligibilityChecker {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("100_Days_Of_Java\n");  
    System.out.println("===== CREDIT CARD ELIGIBILITY CHECKER =====");  

    System.out.print("Enter your Name: ");  
    String name = sc.nextLine();  

    System.out.print("Enter your Age: ");  
    int age = sc.nextInt();  

    System.out.print("Enter your Monthly Salary (in INR): ");  
    double salary = sc.nextDouble();  

    System.out.print("Enter your Credit Score: ");  
    int creditScore = sc.nextInt();  

    boolean isEligible = false;  
    String reason = "";  

    if(age < 18) {  
        reason = "You must be at least 18 years old to apply for a credit card.";  
    } else if(salary < 15000) {  
        reason = "Your monthly salary must be at least ₹15,000.";  
    } else if(creditScore < 650) {  
        reason = "Your credit score must be 650 or higher.";  
    } else {  
        isEligible = true;  
    }  

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  

    System.out.println("\n===== RESULT =====");  
    System.out.println("Date & Time: " + dtf.format(now));  
    System.out.println("Applicant Name: " + name);  

    if(isEligible) {  
        System.out.println("Status: Eligible for Credit Card");  
        System.out.println("Congratulations! You can apply for a credit card.");  
    } else {  
        System.out.println("Status: Not Eligible");  
        System.out.println("Reason: " + reason);  
    }  

    sc.close();  
}  


}
