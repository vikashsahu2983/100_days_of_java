import java.util.Scanner;
import java.text.DecimalFormat;


public class SmartWaterTankMonitor {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.println("Smart Water Tank Monitor\n");  
    System.out.print("Enter number of tanks: ");  
    int n = 0;  
    try {  
        n = Integer.parseInt(sc.nextLine().trim());  
    } catch (Exception e) {  
        System.out.println("Invalid number. Exiting.");  
        sc.close();  
        return;  
    }  

    WaterTank[] tanks = new WaterTank[n];  

    for (int i = 0; i < n; i++) {  
        System.out.println("\nEnter details for tank " + (i + 1));  

        System.out.print("Tank name: ");  
        String name = sc.nextLine().trim();  
        if (name.isEmpty()) {  
            name = "Tank" + (i + 1);  
        }  

        double capacity = 0;  
        while (true) {  
            System.out.print("Tank capacity (liters): ");  
            String capInput = sc.nextLine().trim();  
            try {  
                capacity = Double.parseDouble(capInput);  
                if (capacity <= 0) {  
                    System.out.println("Capacity must be greater than 0. Please enter again.");  
                    continue;  
                }  
                break;  
            } catch (Exception e) {  
                System.out.println("Invalid input. Please enter a numeric capacity.");  
            }  
        }  

        double currentLevel = 0;  
        while (true) {  
            System.out.print("Current water level (liters): ");  
            String lvlInput = sc.nextLine().trim();  
            try {  
                currentLevel = Double.parseDouble(lvlInput);  
                break;  
            } catch (Exception e) {  
                System.out.println("Invalid input. Please enter a numeric value.");  
            }  
        }  

        tanks[i] = new WaterTank(name, capacity, currentLevel);  
    }  

    System.out.println("\n--- Water Tank Status ---");  
    for (WaterTank t : tanks) {  
        t.checkLevel();  
    }  

    sc.close();  
}  


}



class WaterTank {
private String name;
private double capacity;
private double currentLevel;
private static final DecimalFormat df = new DecimalFormat("0.0");

public WaterTank(String name, double capacity, double currentLevel) {  
    this.name = name;  
    this.capacity = capacity;  
    this.currentLevel = currentLevel;  
}

public void checkLevel() {  
    if (capacity <= 0) {  
        System.out.println("Tank: " + name + " | Invalid capacity.");  
        return;  
    }  
    double percentage = (currentLevel / capacity) * 100.0;  
    String pctStr = df.format(percentage);  
    System.out.println("Tank: " + name + " | Level: " + pctStr + "%");  

    if (currentLevel > capacity) {  
        System.out.println("Alert: Overflow in " + name + "! Reduce input or check valve.");  
    } else if (percentage < 20.0) {  
        System.out.println("Alert: Refill needed in " + name + "!");  
    } else {  
        System.out.println("Level normal in " + name + ".");  
    }  
    System.out.println();  
}  


}
