Day 7 - Program- Vehicle Registrations System
______________________________________________

Scenario 4: Imagine you manage vehicle registrations. Each vehicle has the following details:
Owner name
Model
Color
Registration number

When a vehicle is sold to another person, you want to create a new vehicle record
by copying the old vehicle’s details but changing the owner name.

Your Task
Create a class called Vehicle with the following fields:

String ownerName
String model
String color
String registrationNumber

Write two constructors in the Vehicle class:
A regular constructor to create a vehicle record.
A copy constructor that copies all details from another Vehicle object but accepts
a new owner name.

In your main method:
Create an original vehicle record.
Create a transferred vehicle record using the copy constructor with a new owner name.

Print both vehicle records to show that:
All details except the owner name are the same.
Learning Goals
Learn how to clone an object while changing ownership details.
Understand selective field modification in copy constructors.

Expected Output Example

Original Vehicle:  
Owner Name: Amit Reddy  
Model: Honda Civic  
Color: Blue  
Registration Number: TS09K1234  
------------------------------  
Transferred Vehicle (Copied):  
Owner Name: Sabnam Khan
Model: Honda Civic  
Color: Blue  
Registration Number: TS09K1234




______________________________________________________________
Here input and output from the Real Program --  

 -----welcome to vehicle registrations System-----

Enter the name of Owner : vikash
Enter model : top
Enter color : blcak
Enter registrationNumber : 789


-------Vehicle Details-------
Name : vikash
Model : top
Color : blcak
Registration Number : 789
------------------------------
enter 'YES' to sell your Vehicle or 'NO'
yes
Enter the new Owner name : abhigyan
Vehicle Sold !
New Owner


-------Vehicle Details-------
Name : abhigyan
Model : top
Color : blcak
Registration Number : 789
------------------------------
THANK YOU FOR USING 'vehicle registrations System'
