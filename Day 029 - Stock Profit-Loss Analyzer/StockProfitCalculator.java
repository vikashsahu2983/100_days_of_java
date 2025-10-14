import java.util.Scanner;


public class StockProfitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("100_Days_of_Java");
        System.out.println("Welcome to Stock Profit-Loss Analyzer\n\n");
        System.out.print("Enter company name: ");
        String name = sc.nextLine();

        System.out.print("Enter buying price per stock: ");
        double buyPrice = sc.nextDouble();

        System.out.print("Enter number of stocks purchased: ");
        int count = sc.nextInt();

        System.out.print("Enter current price per stock: ");
        double currentPrice = sc.nextDouble();

        Stock s1 = new Stock(name, buyPrice, count, currentPrice);
        s1.calculateProfitLoss();
    }
}


class Stock {
    String companyName;
    double buyingPrice;
    int stockCount;
    double currentPrice;

    // Constructor
    Stock(String companyName, double buyingPrice, int stockCount, double currentPrice) {
        this.companyName = companyName;
        this.buyingPrice = buyingPrice;
        this.stockCount = stockCount;
        this.currentPrice = currentPrice;
    }

    // Method to calculate profit or loss
    void calculateProfitLoss() {
        double totalInvestment = buyingPrice * stockCount;
        double currentValue = currentPrice * stockCount;
        double difference = currentValue - totalInvestment;
        double percentage = (difference / totalInvestment) * 100;

        System.out.println("\n----- Stock Report -----");
        System.out.println("Company: " + companyName);
        System.out.println("Total Investment: " + totalInvestment);
        System.out.println("Current Value: " + currentValue);

        if (difference > 0) {
            System.out.println("Profit: " + difference + " (" + String.format("%.2f", percentage) + "%)");
        } else if (difference < 0) {
            System.out.println("Loss: " + Math.abs(difference) + " (" + String.format("%.2f", Math.abs(percentage)) + "%)");
        } else {
            System.out.println("No profit, no loss. You're at break-even!");
        }
    }
}
