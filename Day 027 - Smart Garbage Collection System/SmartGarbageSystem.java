import java.util.Scanner;


public class SmartGarbageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("100_days_of_java\n\n");
        System.out.println("Smart Garbage Collection System\n");

        System.out.print("Enter number of areas: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        GarbageBin[] bins = new GarbageBin[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for area " + (i + 1));
            System.out.print("Area name: ");
            String name = sc.nextLine();
            System.out.print("Bin capacity: ");
            int capacity = sc.nextInt();
            System.out.print("Current garbage amount: ");
            int load = sc.nextInt();
            sc.nextLine(); // consume newline
            bins[i] = new GarbageBin(name, capacity, load);
        }

        System.out.println("\n--- Garbage Bin Status ---");
        for (GarbageBin bin : bins) {
            bin.checkCapacity();
        }
    }
}



class GarbageBin {
    private String areaName;
    private int capacity; // total capacity of bin
    private int currentLoad; // current garbage amount

    public GarbageBin(String areaName, int capacity, int currentLoad) {
        this.areaName = areaName;
        this.capacity = capacity;
        this.currentLoad = currentLoad;
    }

    public void checkCapacity() {
        double percentageFull = ((double) currentLoad / capacity) * 100;
        System.out.println("Area: " + areaName + " | Bin Capacity: " + percentageFull + "%");
        if (percentageFull > 80) {
            System.out.println("Alert: Truck needed in " + areaName + "!");
        } else {
            System.out.println("No alert needed.");
        }
    }
}

