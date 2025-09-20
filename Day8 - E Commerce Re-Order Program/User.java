//import Scanner here
import java.util.Scanner;
//copy constructor will user here


//BLC - Business logic class 
class User{
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the Product name : ");
    String name=sc.nextLine();
    
    System.out.print("Enter the Price of Product : ");
    double price=sc.nextDouble();
    
    System.out.print("Enter the qty of Product : ");
    int qty=sc.nextInt();
    sc.nextLine(); 
    
    System.out.print("Enter the Address : ");
    String address=sc.nextLine();
    
    System.out.print("Enter the Payment Method : ");
    String paymentMethod=sc.nextLine();
    
    Order o1=new Order(name,price,qty,address,paymentMethod);
    
    System.out.println("enter 'yes' to reorder the Product Or 'No' to confirm Order");
    String status=sc.next();
    Order o2=null;
    if(status.equalsIgnoreCase("yes"))
    {
    System.out.print("enter the new address for order again : ");
        String address2=sc.nextLine();
        sc.nextLine();
    System.out.print("enter the payment Method for order again : ");
        String paymentMethod2=sc.nextLine();
         o2=new Order(o1,address2,paymentMethod2);
       
    }
    else 
    System.out.println("thank for your response");
    
    System.out.println("Your order Success Fully Registered!");
    System.out.println("----------Order detail----------");
    
    System.out.println(o1.orderDetails());
    
    if(status.equalsIgnoreCase("yes"))
     System.out.println(o2.orderDetails());
    }
}


//ELC - execution logic class 
class Order{
    String name;
    double price;
    int quantity;
    String address;
    String paymentMethod;
    //constructor to define the object instance variable 
    Order(String name, double price, int quantity, String address, String paymentMethod){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.address=address;
        this.paymentMethod=paymentMethod;
    }
  //constructor to set value for the reorder with the previous order detail
     Order(Order o,String address, String paymentMethod){
        this.name=o.name;
        this.price=o.price;
        this.quantity=o.quantity;
        this.address=address;
        this.paymentMethod=paymentMethod;
    }
  //Method to display the Details
    public String orderDetails(){
        return "\nname : "+name+
                "\nPrice : "+price+
                "\nQuantity : "+quantity+
                "\nAddress : "+address+
                "\npayment Method : "+paymentMethod+"\n";
    }
    
}
