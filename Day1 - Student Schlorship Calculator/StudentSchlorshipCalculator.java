import java.util.Scanner;

class StudentSchlorshipCalculator{
    static String collegeName;
    String name;
    int rollNo;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    double per;
    String schlorshipStatus;
   
   //constructor to set the data at the time of object creation
   
StudentSchlorship(String name,int rollNo,int sub1,int sub2,int sub3,int sub4){
    this.name=name;
    this.rollNo=rollNo;
    if((sub1<=100 && sub1>=0) && (sub2<=100 && sub2>=0) && (sub3<=100 && sub3>=0) && (sub4<=100 && sub4>=0)) {
         this.sub1=sub1;
    this.sub2=sub2;
    this.sub3=sub3;
    this.sub4=sub4;
   
    }
    else {
        System.err.println("Entered Invalid marks! Try Again!");
        System.exit(0);
    }
}

//to calculate the percentage of the given marks

public double calculatePercentage(){
    this.per=(this.sub1+this.sub2+this.sub3+this.sub4)/4;
    checkScholarship();
    return this.per;
    
}

//method to check the status of the schlorship for the student 
public void checkScholarship(){
    if (this.per>90 && this.per<=100)  
    this.schlorshipStatus="Full Schlorship";  
    else if (this.per>75 && this.per<=90)
    this.schlorshipStatus="half Schlorship"; 
    else 
    this.schlorshipStatus= "No Schlorship";  
}

//display detail method to display the detial of the students 
 public String displayDetail(){
    return 
    "\n\n"+
    "Collage Name :"+collegeName+
    "\nStudent Name : "+this.name+
    "\nRoll no : "+this.rollNo+
    "\nFirst Sub Marks : "+this.sub1+
    "\nSecond Sub Marks : "+this.sub2+
    "\nThird Sub Marks : "+this.sub3+
    "\nFourth Sub Marks : "+this.sub4+
    "\nOverall Percentage : "+this.per+"%"+
    "\nSchlorship Status : "+this.schlorshipStatus;
 }

//main method here 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the College Name : ");
        collegeName=sc.nextLine();
        System.out.print("ENter the Student Name : ");
        String name=sc.nextLine();
        System.out.print("Enter the roll Number : ");
        int rollNo=sc.nextInt();
        System.out.print("Enter the First Sub Marks : ");
        int sub1=sc.nextInt();
        System.out.print("Enter the Second Sub Marks : ");
        int sub2=sc.nextInt();
        System.out.print("Enter the Third Sub Marks : ");
        int sub3=sc.nextInt();
        System.out.print("Enter the Fourth Sub Marks : ");
        int sub4=sc.nextInt();
        StudentSchlorship s1=new StudentSchlorship(name,rollNo,sub1,sub2,sub3,sub4);
    //   System.out.println( s1.calculatePercentage());
        s1.calculatePercentage();
        System.out.println( s1.displayDetail());
    }
}     


