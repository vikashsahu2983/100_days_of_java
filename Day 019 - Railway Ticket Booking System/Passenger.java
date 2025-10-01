//import Scanner class here
import java.util.Scanner;
//BLC-Business logic class
class Passenger{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the indian reilways"+"\n"+"ticket booking page");
        //first object of the TrainTicket class
        System.out.print("passenger name : ");
        String name=sc.nextLine();
        System.out.print("passenger age : ");
        int age=sc.nextInt();
        System.out.print("Train number : ");
        long trainNumber=sc.nextLong();
        sc.nextLine();
        System.out.print("enter origin Station : ");
        String origin=sc.nextLine();
        System.out.print("Enter destination Station : ");
        String destination=sc.nextLine();
        System.out.print("Total distance : ");
        long distance=sc.nextLong();
        sc.nextLine();
        System.out.print("enter class of ticket : ");
        String coach=sc.nextLine();
         TrainTicket t1=new TrainTicket(name,age,trainNumber,origin,destination,coach,distance);
        
        System.out.println(t1.displayTicketDetail());
        System.out.println("thank for using Indian Railways");
    }
}

//ELC-Execution logic class
public class TrainTicket{
    //instance variable for the object/passenger
    String name;
    int age;
    long trainNumber;
    String origin;
    String destination;
    String coach;
    long distance;
    long ticketPrice;
    long discount;
    long totalPrice;
    
    //constructor to set the passenger data
    TrainTicket(String name,int age,long trainNumber,String origin,String destination,String coach,long distance){
        this.name=name;
        this.age=age;
        this.trainNumber=trainNumber;
        this.origin=origin;
        this.destination=destination;
        this.coach=coach;
        this.distance=distance;
    }
  //method to return the ticket price based on their distance
    public double ticketPrice(){
        if(distance>0){
            if(distance>0 && distance<=100)
            return 200;
            else if(distance>100 && distance<=200)
            return 400;
            else if(distance>200 && distance<=300)
            return 600;
            else if(distance>300 && distance<=400)
            return 800;
            else if(distance>400 && distance<=500)
            return 1000;
            else return 1500;
        }
        else{
            System.err.println("you entered a wrong distance ! try again");
            System.exit(0);
        }
        return 0;
    }
  //method to calculate the discount based on the ticket price 
    public double calculateDiscount()
    {
        return ticketPrice()*0.15;
    }
  
  //method to calculate the total ticket price to be paid  
    public double totalPrice()
    {
        return ticketPrice()-calculateDiscount();
    }

  //method to display the ticket details
    public String displayTicketDetail()
    {
        return "\n\n-----ticket detail-----"+
                "\nname : "+name+
                "\nage : "+age+
                "\nTrain Number : "+trainNumber+
                "\nOrigin : "+origin+
                "\ndestination : "+destination+
                "\nclass : "+coach+
                "\nTotal distance : "+distance+
                "\nTotal Ammount : "+ticketPrice()+
                "\ndiscount ammount : "+calculateDiscount()+
                "\nAmmount to be paid : "+totalPrice();
    }
}


