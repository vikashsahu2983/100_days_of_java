//import Scanner here
import java.util.Scanner;

//BLC - business logic class
class VehicleOwner{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(" -----welcome to vehicle registrations System-----\n");
        System.out.print("Enter the name of Owner : ");
        String name=sc.nextLine();
        System.out.print("Enter model : ");
        String model=sc.nextLine();
        System.out.print("Enter color : ");
        String color=sc.nextLine();
        System.out.print("Enter registrationNumber : ");
        String registrationNumber=sc.nextLine();
        Vehicle v1=new Vehicle(name,model,color,registrationNumber);
        System.out.println(v1.vehicleDetail());
        
    System.out.println("enter 'YES' to sell your Vehicle or 'NO'");
    String status=sc.nextLine();
    Vehicle v2=null;
    if(status.equalsIgnoreCase("yes"))
        {
          System.out.print("Enter the new Owner name : ");
          String name2=sc.nextLine();
          v2=new Vehicle(v1,name2);
          System.out.println("Your Vehicle Sold !");
          System.out.println("New Owner");
          System.out.println(v2.vehicleDetail());
        }
    else 
        System.out.println("thank you! your Vehicle Registered SuccessFully! ");
    
        System.out.println("THANK YOU FOR USING 'vehicle registrations System'");
    }
}

//ELC - execution logic class
class Vehicle{
    String ownerName;
    String model;
    String color;
    String registrationNumber;
    
    Vehicle(String ownerName,String model,String color,String registrationNumber){
        this.ownerName=ownerName;
        this.model=model;
        this.color=color;
        this.registrationNumber=registrationNumber;
    }
    Vehicle(Vehicle v,String ownerName){
        this.ownerName=ownerName;
        this.model=v.model;
        this.color=v.color;
        this.registrationNumber=v.registrationNumber;
    }
    public String vehicleDetail(){
        return "\n\n-------Vehicle Details-------\n"+
                "Name : "+ownerName+
                "\nModel : "+model+
                "\nColor : "+color+
                "\nRegistration Number : "+registrationNumber+
                "\n------------------------------";
    }
}
