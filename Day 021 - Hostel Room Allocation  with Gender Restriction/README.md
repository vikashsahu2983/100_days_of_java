Day 021 - Problem - Hostel Room Allocation with Gender Restriction
____________________________________________________________________
Problem Statement: Create a Hostel class to manage room allocation for students based on gender restrictions of the hostel.

Requirements:
Instance variables:
roomNo
studentName
gender
age
contactNumber
aadharNumber
hometownCity
qualification

Static variable:
hostelType → (Boys Hostel / Girls Hostel)

Method:
allocateRoom()

If student’s gender matches the hostel type, allocate the room.
Otherwise, reject the request with an error message.

Sample Input:
Hostel Type: Girls Hostel  
Enter Student Details  
-----------------------  
Student Name: Ramesh  
Gender: Male  
Age: 20  
Contact Number: 9876543210  
Aadhar Number: 1234-5678-9012  
Hometown City: Bhopal  
Qualification: B.Tech CSE  
Room Number: 105  

Sample Output (Case 1 - Gender Mismatch):
Allocation Failed! Gender mismatch with Hostel type.
Student: Ramesh
Gender: Male
Applied for: Girls Hostel

Sample Output (Case 2 - Successful Allocation):

If Hostel Type = Boys Hostel and Student Gender = Male

Room Allocation Successful!
----------------------------
Hostel Type: Boys Hostel
Room Number: 105
Student Name: Ramesh
Gender: Male
Age: 20
Contact Number: 9876543210
Aadhar Number: 1234-5678-9012
Hometown City: Bhopal
Qualification: B.Tech CSE1

<img width="446" height="836" alt="image" src="https://github.com/user-attachments/assets/021f58ce-b2b3-46bb-acdd-1a47948b33f7" />

