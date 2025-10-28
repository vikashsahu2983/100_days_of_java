import java.util.Scanner;

class HealthyWeightPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("100_Days_of_Java");
        System.out.println("Welcome to Healthy Human Weight Predictor\n\n");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        double predictedWeight;

        if (age <= 0) {
            System.out.println("Invalid age. Please enter a positive number.");
            return;
        } else if (age <= 10) {
            predictedWeight = (age * 2) + 8;
        } else if (age <= 20) {
            predictedWeight = (age * 2.5) + 5;
        } else if (age <= 60) {
            predictedWeight = (age * 0.9) + 45;
        } else {
            predictedWeight = (age * 0.5) + 40;
        }

        System.out.printf("Predicted healthy weight for age %d is approximately %.1f kg.%n", age, predictedWeight);
    }
}
