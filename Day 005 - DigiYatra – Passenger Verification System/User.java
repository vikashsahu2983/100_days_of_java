import java.util.Scanner;

class User{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String passengerId=sc.nextLine();
        String fullName=sc.nextLine();
        String passportNumber=sc.nextLine();
        String flightNumber=sc.nextLine();
        DigiYatra d1= new DigiYatra( passengerId, fullName,passportNumber,flightNumber);
        System.out.println(d1.DisplayStatus());

    }
}

class DigiYatra{
    String passengerId; 
    String fullName; 
    String passportNumber; 
    String flightNumber;

    DigiYatra(String passengerId, String fullName, String passportNumber,String flightNumber){
        this.passengerId=passengerId;
        this.fullName=fullName;
        this.passportNumber=passportNumber;
        this.flightNumber=flightNumber;
    }
    
    public boolean verifyIdentity(){
        if(passengerId == null || passengerId.isEmpty() || fullName == null || fullName.isEmpty() || passportNumber == null || passportNumber.isEmpty()
                || flightNumber == null || flightNumber.isEmpty())
        return false;
        else return true;
    }

     public boolean passportNumberVerification(){
        if(passportNumber.matches("[A-Z0-9]{8}"))
        return true;
        else return false;
     }

     public String DisplayStatus(){
        if(verifyIdentity() && passportNumberVerification()){
            return "Verification Status: Success\nPassport Verification: Valid" ;
        }
        else return "Verification Status: unSuccess\nPassport Verification: inValid" ;
     }

    
}













