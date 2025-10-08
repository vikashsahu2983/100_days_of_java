import java.util.Scanner;

class SalaryExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("100_days_of_Java\n\n");
        System.out.println("---Welcome to the salary Expenxe Tracker System---");

        // Step 1: Salary input
        System.out.print("Enter your total salary: ");
        double salary = sc.nextDouble();

        // Step 2: Kitne jagah expenses hai
        System.out.print("Enter number of expense categories: ");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        String[] expenseNames = new String[n];
        double[] expenseAmounts = new double[n];

        double totalExpenses = 0;

        // Step 3: Expense details input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of expense " + (i + 1) + ": ");
            expenseNames[i] = sc.nextLine();

            System.out.print("Enter amount for " + expenseNames[i] + ": ");
            expenseAmounts[i] = sc.nextDouble();
            sc.nextLine(); // buffer clear

            totalExpenses += expenseAmounts[i];
        }

        // Step 4: Output each expense with % of salary
        System.out.println("\n----- Expense Report -----");
        for (int i = 0; i < n; i++) {
            double percent = (expenseAmounts[i] / salary) * 100;
            System.out.printf("%s: %.2f (%.2f%% of salary)\n", expenseNames[i], expenseAmounts[i], percent);
        }

        // Step 5: Remaining salary
        double remaining = salary - totalExpenses;
        double remainingPercent = (remaining / salary) * 100;

        System.out.println("--------------------------");
        System.out.printf("Total Expenses: %.2f (%.2f%% of salary)\n", totalExpenses, (totalExpenses / salary) * 100);
        System.out.printf("Remaining Amount: %.2f (%.2f%% of salary)\n", remaining, remainingPercent);
    }
}
