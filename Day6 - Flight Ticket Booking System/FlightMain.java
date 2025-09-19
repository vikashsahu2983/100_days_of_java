//Scanner import here 
import java.util.Scanner;


//BLC-business logic class
class FlightMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Indigo Flight");
        System.out.print("enter the passenger name : ");
        String name=sc.nextLine();
        System.out.print("Enter your destination : ");
        String destination=sc.nextLine();
        System.out.print("Enter your travelling class : ");
        String seatClass=sc.nextLine();
        FlightTicket f1= new FlightTicket(name,destination,seatClass);
        System.out.println(f1.printTicketSummary());
        
        
    }
}


//ELC- execution logic class
class FlightTicket{
    String passengerName;
    String destination;
    String seatClass;

FlightTicket(String passengerName, String destination, String seatClass){
    this.passengerName=passengerName;
    this.destination=destination;
    this.seatClass=seatClass;
}

   public String printTicketSummary(){
       return "Passenger: "+passengerName+
                ", Destination: "+destination+
                ", Class: "+seatClass;
                
                
// Passenger: John, Destination: Paris, Class: Economy
   }
}
