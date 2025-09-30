import java.util.Scanner;
class Restaurant{
    String restaurantName;
    String lastOrderedItem;
    int qty=0;
    static int totalOrders=0;
    
    public void placeOrder(String itemName, int quantity){
        totalOrders=totalOrders+quantity;
        this.lastOrderedItem= itemName;
        this.qty=quantity;
    }
    public void display()
    {
         System.out.println(" ");
        System.out.println("Ordered Item : " +lastOrderedItem);
        System.out.println("qty of Ordered Item : " +qty);
        System.out.println(" " );
        System.out.println("Total order on zomato : " +totalOrders);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Restaurant bahar = new Restaurant();
        System.out.print("Enter the food name :");
        String food1 = sc.nextLine();
        System.out.print("Enter the qty of food :");
        int qty1= sc.nextInt();
        bahar.placeOrder(food1,qty1);
        bahar.display();
        
        Restaurant taj = new Restaurant();
        sc.nextLine();
        System.out.print("Enter the food name :");
        String food2 = sc.nextLine();
        System.out.print("Enter the qty of food :");
        int qty2= sc.nextInt();
        taj.placeOrder(food2,qty2);
        taj.display();
        
        Restaurant mahfil = new Restaurant();
        sc.nextLine();
        System.out.print("Enter the food name :");
        String food3 = sc.nextLine();
        System.out.print("Enter the qty of food :");
        int qty3= sc.nextInt();
        mahfil.placeOrder(food3,qty3);
        mahfil.display();
    }
}
