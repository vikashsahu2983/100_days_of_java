//Import Scanner class here 
import java.util.Scanner;

//BLC - business logic class
public class Hostal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("---Welcome to the Hostal booking System--\n\n");
        System.out.print("Enter the Hostal Name : ");
         String hostalName=sc.nextLine();
        System.out.print("Enter the hostal type (male/female) : ");
        String hostalType=sc.nextLine();
        System.out.println("__Enter personal detail to book you seat in hostal__\n");
        System.out.print("enter your name :");
        String studentName=sc.nextLine();
        System.out.print("enter your age :");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("enter your gender(male/female) :");
        String gender=sc.nextLine();
        
        
        long contactNo=0;
        long aadharNumber=0;
        String hometownCity=null;
        String qualification=null;
        int sharing=0;
        
        
       if ( ( (hostalType.equalsIgnoreCase("male") || hostalType.equalsIgnoreCase("men")) 
       && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("men")) )
   || ( (hostalType.equalsIgnoreCase("female") || hostalType.equalsIgnoreCase("women")) 
       && (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("women")) ) ){
            
             System.out.print("enter your contact no :");
        contactNo=sc.nextLong();
        System.out.print("enter your Aadhar id :");
         aadharNumber=sc.nextLong();
        sc.nextLine();
        System.out.print("enter your hometown city :");
         hometownCity=sc.nextLine();
        System.out.print("enter the qualification :");
         qualification=sc.nextLine();
        System.out.print("enter your room Sharing (2/3/4) :");
         sharing=sc.nextInt();
            
        }
        
       else {
           System.out.println("Allocation Failed! Gender mismatch with Hostel type.");
           System.exit(0);
       }
       
       Student s1=new Student(hostalName,hostalType,studentName,age,gender,contactNo, aadharNumber, hometownCity, qualification,sharing);
       System.out.println(s1.displayRecipt());
   
    }
    
}

class Student{
    String hostalName;
    String hostalType;
    String studentName;
    int age;
    String gender;
    long contactNo;
    long aadharNumber;
    String hometownCity;
    String qualification;
    int sharing;
    static int roomNo=100;
    
    Student(String hostalName,String hostalType,String studentName,int age,String gender,long contactNo,long aadharNumber,String hometownCity,String qualification,int sharing){
        this.hostalName=hostalName;
        this.hostalType=hostalType;
        this.studentName=studentName;
        this.age=age;
        this.gender=gender;
        this.contactNo=contactNo;
        this.aadharNumber=aadharNumber;
        this.hometownCity=hometownCity;
        this.qualification=qualification;
        this.sharing=sharing;
        roomNo++;
    }
    
    public String displayRecipt(){
        return "\n\n------------Hostal Recipt--------------"+
               "\n________________________________________"+
               "\n\nHostal name : "+hostalName+
               "\nHostal Type : "+hostalType+
               "\nStudent name : "+studentName+
               "\nAge : "+age+
               "\nGender : "+gender+
               "\nContact Number : "+contactNo+
               "\nAadhar number : "+aadharNumber+
               "\nHomeTown city : "+hometownCity+
               "\nQualification : "+qualification+
               "\nSharing : "+sharing+
               "\n Room Number"+roomNo+
               "\n________________________________________"+
               "\nPlease Submit Your Hotal fees"+
               "\nWish You All The Best For Your Future";
    } 
}
