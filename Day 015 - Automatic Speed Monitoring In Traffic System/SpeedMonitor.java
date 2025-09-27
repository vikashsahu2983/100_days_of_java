import java.util.Scanner;

class SpeedMonitor{
    static int speed;

    public static String checkSpeed(int speed){
       if(speed<0){
        return "Invalid speed";

       }
       else {
         if(speed>80) return "Over Speeding";
        else return "Speed is within limit";
       }

    }

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        speed=sc.nextInt();
        System.out.println(checkSpeed(speed));
    }
}
