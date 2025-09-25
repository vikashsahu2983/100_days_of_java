import java.util.Scanner;
public class BankMain{
    public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter how many account you want to open : ");
    int noOfAcc=sc.nextInt();
    for(int i=0;i<noOfAcc;i++){
    System.out.print("enter the name of account holder : ");
    String name=sc.next();
    System.out.print("enter the ammount to open account : ");
    double balance=sc.nextDouble();
     BankAccount a = new BankAccount(name,balance);
     System.out.println(a.displayAccount());
    }
}
}

class BankAccount{
    static int nextAccountNumber=101;
    String name;
    double balance;
    int accountNumber;
    
    BankAccount(String name, double balance){
        this.name=name;
        this.balance=balance;
        this.accountNumber=nextAccountNumber;
        nextAccountNumber++;
    }
    
    //here method to prints account details.
    public String displayAccount(){
        return "AccountHolder: "+name+
                ", AccountNo: "+accountNumber+
                ", Balance: "+balance;
    }
}
