

import java.util.Scanner;
class StudentMain{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the name of the student: ");
        String name=sc.nextLine();
        System.out.print("Enter the marks of 1st sub. : ");
        int sub1=sc.nextInt();
        System.out.print("Enter the marks of the 2nd sub. : ");
        int sub2 =sc.nextInt();
        System.out.print("Enter the marks of the 3rd sub. : ");
        int sub3=sc.nextInt();
        Student s1=new Student(name,sub1,sub2,sub3);
        System.out.println(s1.displayResult());
    }
    
}

//ELC - Execution logic class
class Student{
    String name;
    int sub1;
    int sub2;
    int sub3;
    double avgMarks;
    char grade;

    Student(String name,int sub1,int sub2,int sub3){
        this.name=name;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        // getAverage();
    }
    
    //method to get tha average of the given sub marks 
    public Double getAverage(){
        this.avgMarks=(this.sub1+this.sub2+this.sub3)/3.0;
        // getGrade();
        return avgMarks;
        
    }
    
    //method to get the grade of the student based on their avg marks 
    public char getGrade(){
        if (this.avgMarks >= 85) grade = 'A';
        else if (this.avgMarks >= 70) grade = 'B';
        else grade = 'C';
        this.grade=grade;
        return grade;
    }
    
    
    //method to display the result (name,avg marks and grade ) of the student like this(Student: John, Average: 58.3, Grade: C)
    public String displayResult(){
        return "Student:"+name+", Average: "+String.format("%.1f",getAverage())+", Grade: "+getGrade();
        
    } 
}

// o/p sample here -
// Student: John, Average: 58.3, Grade: C

