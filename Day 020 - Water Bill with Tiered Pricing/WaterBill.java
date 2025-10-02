//import Scanner class here 
import java.util.Scanner;

//BLC - business logic class/main clss
public class WaterBill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Water Billing System");
        System.out.print("enter the customer Name : ");
        String cusName=sc.nextLine();
        System.out.print("enter the Address : ");
        String address=sc.nextLine();
        System.out.print("enter the House Number : ");
        int houseNo=sc.nextInt();
        System.out.print("enter the connection Number : ");
        long connectionNo=sc.nextLong();
        System.out.print("enter the Bill number : ");
        long billNo=sc.nextLong();
        System.out.print("enter the No of family member : ");
        int familyMember=sc.nextInt();
        System.out.print("enter the total water consumption : ");
        long waterConsumed=sc.nextLong();
        
        //object created here 
        Customer c1=new Customer(cusName,address,houseNo,connectionNo,billNo,familyMember,waterConsumed);
        
        //call method to display the Water bill
        System.out.println(c1.displayBill());
    }
}

//ELC - execution logic class
class Customer{
    String cusName;
    String address;
    int houseNo;
    long connectionNo;
    long billNo;
    int familyMember;
    long waterConsumed;
    long totalAmount;
    
    //constructor to create the object with the help of coming data
Customer(String cusName,String address,int houseNo,long connectionNo,long billNo,int familyMember,long waterConsumed){
    this.cusName=cusName;
    this.address=address;
    this.houseNo=houseNo;
    this.connectionNo=connectionNo;
    this.billNo=billNo;
    this.familyMember=familyMember;
    this.waterConsumed=waterConsumed;
}

//method to calculate the bill
public double calculateBill(){
    if(waterConsumed>0){
        if(waterConsumed>0 && waterConsumed<=200){
            return waterConsumed*2;
        }
        else if(waterConsumed>0 && waterConsumed<=200){
             return waterConsumed*3;
        }
        else {
             return waterConsumed*5;
        }
        
    }
    else{
        System.err.println("you entered a wrong waterConsumed");
        System.exit(0);
    }
    return 0;
}

//method to display the total bill 
public String displayBill(){
    return "\n\n\n-------------WATER BILL----------------"+
            "\n---------------------------------------"+
            "\nCustomer name : "+cusName+
            "\nHouse Number : "+address+
            "\nHouse Number : "+houseNo+
            "\nConnection Number : "+connectionNo+
            "\nBill Number : "+billNo+
            "\nTotal Family Member : "+familyMember+
            "\nTotal water Consumed "+waterConsumed+
            "\nTotal ammount to be Paid : "+calculateBill();
}
}

/*
Welcome to the Water Billing System
enter the customer Name : vikash sahu
enter the Address : tikuriya toka satna 
enter the House Number : 102
enter the connection Number : 1247785
enter the Bill number : 85274
enter the No of family member : 6
enter the total water consumption : 850



-------------WATER BILL----------------
---------------------------------------
Customer name : vikash sahu
House Number : tikuriya toka satna 
House Number : 102
Connection Number : 1247785
Bill Number : 85274
Total Family Member : 6
Total water Consumed 850
Total ammount to be Paid : 4250.0

=== Code Execution Successful ===
*/
