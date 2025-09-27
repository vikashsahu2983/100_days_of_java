
import java.util.Scanner;

//BLC - Business logic class 
class Vehicle {
    private String vehicleType;
    private int vehicleAge;
    
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    
    public void setVehicleAge(int vehicleAge){
        this.vehicleAge=vehicleAge;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public int getVehicleAge(){
        return vehicleAge;
    }

    public void displayDetails(){
        return 
    }
    
    //→ Displays vehicle details (type and age).
}


class InsurancePremium{
    
    private double premiumAmount;
    
    getPremiumAmount()
    
    calculatePremium(Vehicle vehicle, double vehicleValue)
    //→ static method that calculates premium based on rules.

}

//ELC - Execution logic class 
class InsuranceCalculator{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Vehicle v1=new Vehicle();
        System.out.println("enter the type of vehicle (Car / Motorcycle / Truck)");
        String vehicle=sc.nextLine();
        v1.setVehicleType(vehicle);
        System.out.println("enter the age of the vehicle");
        int vehicleAge = sc.nextInt();
        v1.setVehicleAge(vehicleAge);
        
    }
}
