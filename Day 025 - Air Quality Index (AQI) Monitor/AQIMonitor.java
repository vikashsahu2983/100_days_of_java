import java.util.Scanner;
class AQIMonitor {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("100_Days_of_Java");
System.out.println("Welcome to the Air Quality Monitor System\n\n");
System.out.print("Enter AQI value: ");
int aqi = sc.nextInt();

    if(aqi >= 0 && aqi <= 50) {  
        System.out.println("Air Quality is Good.");  
    } else if(aqi >= 51 && aqi <= 100) {  
        System.out.println("Air Quality is Moderate.");  
    } else if(aqi >= 101 && aqi <= 200) {  
        System.out.println("Air Quality is Poor.");  
    } else if(aqi > 200) {  
        System.out.println("Air Quality is Hazardous.");  
    } else {  
        System.out.println("Invalid AQI value.");  
    }  

    sc.close();  
}  


}
