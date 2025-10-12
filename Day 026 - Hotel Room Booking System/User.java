import java.util.Scanner;

class User{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("100_days_of_java\n\n");
        System.out.println("Welcome to Sunshine Grand Hotel\n");
        
        System.out.println("Enter the Following details to Book your room\n\n");
        
        System.out.print("Enter the City Name : ");
        String city=sc.nextLine();
        
        System.out.print("Enter your Name : ");
        String name=sc.nextLine();
        
        System.out.print("Enter your Mobile No. : ");
        long MobileNo=sc.nextLong();
        sc.nextLine();
        
        System.out.print("Enter the type of Room [Standard/Deluxe/Suite] : ");
        String roomType=sc.nextLine();
        
        System.out.print("Enter No of days : ");
        int days=sc.nextInt();
        
        HotelBookingSystem h1=new HotelBookingSystem(city,name, MobileNo,roomType,days);
        System.out.println(h1.getDatails());
    }
}

class HotelBookingSystem{
    static String hotelName = "Sunshine Grand Hotel";
    String city;
    double hotelRatings = 4.5;
    String cusName;
    long mobileNo;
    String roomType;
    int bookingDays;
    int roomPrice;
    int serviceCharge=200;
    int totalAmm;
    
    HotelBookingSystem(String city,String cusName,long mobileNo,String roomType,int bookingDays){
        this.city=city;
        this.cusName=cusName;
        this.mobileNo=mobileNo;
        this.roomType=roomType;
        this.bookingDays=bookingDays;
        
        if(roomType.equalsIgnoreCase("standard")) roomPrice=2000;
    else if(roomType.equalsIgnoreCase("deluxe")) roomPrice=3500;
        else roomPrice=5000;
        
        this.totalAmm=(bookingDays*roomPrice)+200;
    }
    
     public String getDatails(){
            return "\n\n----------- HOTEL BOOKING RECEIPT -----------"+
                    "\nHotel Name : "+hotelName+
                    "\nHotel Ratings : "+hotelRatings+
                    "\nCity : "+city+
                    "\n---------------------------------------------"+
                    "\nCustomer Name : "+cusName+
                    "\nMobile Number : "+mobileNo+
                    "\nRoom Type : "+roomType+
                    "\nDays Stayed : "+bookingDays+
                    "\nRoom Rate : " +roomPrice+ " per Night"+
                    "\nExtra Service Charges : "+serviceCharge+
                    "\n---------------------------------------------"+
                    "\nTotal Bill : "+totalAmm+
                    "\n---------------------------------------------"+
                    "\nThank you, "+cusName+", for staying with"+hotelName+"!"+
                    "\nWe hope to see you again."+
                    "\n---------------------------------------------";
       }
}

/*
----------- HOTEL BOOKING RECEIPT -----------
Hotel Name: Sunshine Grand Hotel
Hotel Rating: 4.5 
City: Jaipur
---------------------------------------------
Customer Name: Neha Sharma
Mobile Number: 9988776655
Room Type: Suite
Days Stayed: 2
Room Rate: ₹5000 per night
Extra Service Charge: ₹0
---------------------------------------------
Total Bill: ₹10000
---------------------------------------------
*/
