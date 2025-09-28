
import java.util.Scanner;
class RestaurantBillingSystem{
    static String resName;
    String cusName;
    String foodItem;
    int qty;
    static int Pizza = 200, Burger = 150, Pasta = 120, Sandwich = 100;
    
    public void setValue(){
        Scanner sc=new Scanner(System.in);
         System.out.print("please enter your name :");
         this.cusName=sc.nextLine();
         
         System.out.println("Menu \n Dish ---- price \n Pizza ---> 200 \n Burger ---> 150 \n Pasta ---> 120 \n Sandwich ---> 100 \n");
         System.out.print("enter the food from above menu :");
         this.foodItem=sc.nextLine();
         
         System.out.print("enter the qty of the food :");
         this.qty=sc.nextInt();
    }
    
    public void displayBill(){

    System.out.println("----- Bill Receipt -----");
    System.out.println("Customer: "+this.cusName);
    System.out.println("Food Item: "+this.foodItem);
    System.out.println("Quantity: "+this.qty);
    double baseAmm=0;
    
    if(this.foodItem.equalsIgnoreCase("Pizza")) baseAmm=this.qty*Pizza;
    else if(this.foodItem.equalsIgnoreCase("Burger")) baseAmm=this.qty*Burger;
    else if(this.foodItem.equalsIgnoreCase("Pasta")) baseAmm=(this.qty*Pasta);
    else if(this.foodItem.equalsIgnoreCase("Sandwich")) baseAmm=this.qty*Sandwich;
    else System.out.println("please enter the valid food name from above menu ! try again");
    
    System.out.println("Base amount :" +baseAmm);
    
    double gstAmm=baseAmm*0.05;
    System.out.println("GST (5%) :" +gstAmm);
    
    double disAmm=baseAmm*0.1;
    System.out.println("Discount (10%) :" +disAmm);
    
    double finalBill=(baseAmm+gstAmm)-disAmm;
    System.out.println("Final Bill :" +finalBill);
    
    System.out.println("------------------------");
    }
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter the name of the Restaurant : ");
        resName=sc.nextLine();
        
        RestaurantBillingSystem cus1=new RestaurantBillingSystem();
        cus1.setValue();
        cus1.displayBill();
        
        RestaurantBillingSystem cus2=new RestaurantBillingSystem();   
        cus2.setValue();
        cus2.displayBill();
    }
}
