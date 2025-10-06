import java.util.Scanner;

class Weather {

    // method outside main()
    public static String weatherDetails(double temperature, double humidity) {
        if (temperature > 35 && humidity > 80)
            return "Heat & Rain Alert";
        else if (temperature > 35)
            return "Heat Alert";
        else if (humidity > 80)
            return "Rain Alert";
        else
            return "Normal Day";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Welcome to Weather Alert System---");
        System.out.println("Enter the details - \n");

        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the humidity: ");
        double humidity = sc.nextDouble();

        // call method
        String result = weatherDetails(temperature, humidity);
        System.out.println("\nWeather Alert: " + result);
    }
}
