Day 041 – Digital Marksheet Generator for Institute 

An institute wants to build a Digital Marksheet Generator that can store and generate a complete result for each student.
Create a Java program that performs the following tasks:
______________________________________________________________________________________________
<img width="430" height="719" alt="Screenshot 2025-11-20 104908" src="https://github.com/user-attachments/assets/193c6648-0bb2-4bf4-9253-de600e6d07b0" />

<img width="345" height="596" alt="image" src="https://github.com/user-attachments/assets/65ca2a6b-3ec3-4bb2-918b-1c65f0c20283" />


______________________________________________________________________________________________



1. Student Information

Ask the user to enter:

Student Name

Age

Class

Date of Birth

Roll Number

Father’s Name

Mother’s Name

Address

Mobile Number

2. Subject Information

Ask the user how many subjects the student has.

For each subject, take:

Subject Name

Marks obtained

3. Processing

Calculate the total marks, percentage, and grade based on percentage.

Grade criteria:

90 to 100 → A+

80 to 89 → A

70 to 79 → B

60 to 69 → C

50 to 59 → D

Below 50 → Fail

4. Result Status

If percentage is 50 or above, the student is Promoted to the next class.

Otherwise, the student is Not Promoted.

5. Output

Generate a clean and professional digital marksheet that prints:

Complete student details

Subject names with their marks

Total marks

Percentage

Grade

Final Status (Promoted / Not Promoted)

Sample Input & Output 1
Input

Name: Rahul Sharma
Age: 16
Class: 10
DOB: 14-05-2009
Roll Number: 1023
Father’s Name: Sanjay Sharma
Mother’s Name: Kavita Sharma
Address: Kukatpally, Hyderabad
Mobile Number: 9876543210

Number of subjects: 3
Subject 1: Math → 88
Subject 2: Science → 92
Subject 3: English → 85

Output

----- DIGITAL MARKSHEET -----
Name: Rahul Sharma
Age: 16
Class: 10
DOB: 14-05-2009
Roll No: 1023
Father’s Name: Sanjay Sharma
Mother’s Name: Kavita Sharma
Address: Kukatpally, Hyderabad
Mobile: 9876543210

Subjects and Marks:
Math: 88
Science: 92
English: 85

Total Marks: 265
Percentage: 88.33%
Grade: A
Status: Promoted

Sample Input & Output 2
Input

Name: Priya Verma
Age: 15
Class: 9
DOB: 11-02-2010
Roll Number: 1134
Father’s Name: Ramesh Verma
Mother’s Name: Sunita Verma
Address: SR Nagar, Hyderabad
Mobile Number: 9090909090

Number of subjects: 4
Hindi → 40
Math → 30
Science → 45
Social → 35

Output

----- DIGITAL MARKSHEET -----
Name: Priya Verma
Age: 15
Class: 9
DOB: 11-02-2010
Roll No: 1134
Father’s Name: Ramesh Verma
Mother’s Name: Sunita Verma
Address: SR Nagar, Hyderabad
Mobile: 9090909090

Subjects and Marks:
Hindi: 40
Math: 30
Science: 45
Social: 35

Total Marks: 150
Percentage: 37.50%
Grade: Fail
Status: Not Promoted
