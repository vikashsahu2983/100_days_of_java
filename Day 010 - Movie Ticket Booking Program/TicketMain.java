//import Scanner in the program here 
import java.util.Scanner;

//BLC - Business Logic Class 
class TicketMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("welcome to movie ticket booking system");
    System.out.print("Enter the movie name : ");
    String movieName=sc.nextLine();
    System.out.print("Enter the seat Number : ");
    String seatNumber=sc.nextLine();
    System.out.print("Enter the price of the ticket");
    double price=sc.nextDouble();
    Ticket t1=new Ticket(movieName,seatNumber,price);
    System.out.println(t1.printTicket());
    }
}

//ELC - Execution Logic Class
class Ticket{
    String movieName;
    String seatNumber;
    double price;
    
    Ticket(String movieName,String seatNumber,double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }
    
    //to print the detail of the user ticket
    public String printTicket() {
        return "Movie: "+movieName+", Seat: "+seatNumber+", Price: "+price;
        
    }
    
}


//Expected Output:
// Movie: Avatar2, Seat: C10, Price: 20.75
