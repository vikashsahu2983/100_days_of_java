


//-------------100 Days of Code Challenge--------------
// Day 3 - Java Programming Language

// import scanner in the program
import java.util.Scanner;

// BLC - Business Logic Class
class User{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name=sc.nextLine();
        System.out.print("Enter the price of Course : ");
        double fee=sc.nextDouble();
        CoursePurchase c1=new CoursePurchase(name,fee);
        System.out.println(c1.genrateBill());
    }
}

// ELC - execution logic class
class  CoursePurchase{
    String student_name;//: Name of the student
    double total_fee;//: Total fee of selected courses
    double discount;//: Discount value
    int reward_points;//: Earned reward points
    double net_payable;//: Fee to be paid after discount
    
    CoursePurchase(String name , double fee){
        this.student_name=name;
        this.total_fee=fee;
    }
    
    
    
//Method to calculate:
  
  //here method to calculate the discount
 public double discount(){
     if(this.total_fee>0 && this.total_fee<5000)
     return (this.total_fee*0.05);
     else if(this.total_fee>5000 && this.total_fee<15000)
     return (this.total_fee*0.1);
     else if(this.total_fee>15000 && this.total_fee<30000)
     return (this.total_fee*0.18);
     else return (this.total_fee*0.25);
 }
   //here method to calculate the Reward point
  public int rewardpoints(){
     if(this.total_fee>0 && this.total_fee<5000)
     return 10;
     else if(this.total_fee>5000 && this.total_fee<15000)
     return 30;
     else if(this.total_fee>15000 && this.total_fee<30000)
     return 60;
     else return 100;
  }

   //here method to calculate the Net payable amount
    public double netPayableAmount(){
        return (this.total_fee-discount());
    }

   //here method to Display the all information.  
    //Method to display all information.  
    
    public String genrateBill(){
        return "---- Online Course Bill ----"+
                "\nStudent Name: "+student_name+
                "\nTotal Fee: Rs:"+total_fee+
                "\nDiscount: Rs:"+discount()+
                "\nReward Points Earned: "+rewardpoints()+
                "\nNet Amount Payable: Rs:"+netPayableAmount();
    }
}
