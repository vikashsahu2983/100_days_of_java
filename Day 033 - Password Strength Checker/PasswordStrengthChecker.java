import java.util.*;
import java.util.regex.*;
import java.time.*;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Password: ");
        String password = sc.nextLine();

        int score = 0;
        String reason = "";

        // Rule 1: Length between 8 and 20
        if (password.length() >= 8 && password.length() <= 20) {
            score++;
        } else {
            reason += "Password length must be between 8 and 20 characters. ";
        }

        // Rule 2: At least one lowercase letter
        if (Pattern.compile("[a-z]").matcher(password).find()) {
            score++;
        } else {
            reason += "Add at least one lowercase letter. ";
        }

        // Rule 3: At least one uppercase letter
        if (Pattern.compile("[A-Z]").matcher(password).find()) {
            score++;
        } else {
            reason += "Add at least one uppercase letter. ";
        }

        // Rule 4: At least one digit
        if (Pattern.compile("[0-9]").matcher(password).find()) {
            score++;
        } else {
            reason += "Add at least one digit. ";
        }

        // Rule 5: At least one special character
        if (Pattern.compile("[!@#$%^&*()\\-_=+\\[\\]{}|;:'\",.<>?/]").matcher(password).find()) {
            score++;
        } else {
            reason += "Add at least one special character. ";
        }

        // Rule 6: No spaces allowed
        if (!password.contains(" ")) {
            score++;
        } else {
            reason += "Password should not contain spaces. ";
        }

        // Rule 7: No more than 2 identical consecutive characters
        boolean repeated = false;
        for (int i = 0; i < password.length() - 2; i++) {
            if (password.charAt(i) == password.charAt(i + 1) && password.charAt(i) == password.charAt(i + 2)) {
                repeated = true;
                break;
            }
        }
        if (!repeated) {
            score++;
        } else {
            reason += "Avoid more than 2 consecutive identical characters. ";
        }

        String status = "";
        if (score == 7) {
            status = "STRONG";
            reason = "Meets all required conditions.";
        } else if (score >= 4) {
            status = "MODERATE";
        } else {
            status = "WEAK";
        }

        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.toString().replace("T", " ").substring(0, 19);

        System.out.println();
        System.out.println("100_Days_Of_Java");
        System.out.println();
        System.out.println("===== PASSWORD STRENGTH CHECKER =====");
        System.out.println("===== RESULT =====");
        System.out.println("Date & Time: " + formattedDateTime);
        System.out.println("User Name: " + name);
        System.out.println("Password Status: " + status);
        System.out.println("Reason: " + reason);
    }
}

