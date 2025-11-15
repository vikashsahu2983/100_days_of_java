Day 034 – Program – University Admission Eligibility Checker
Problem Statement:
Aapko ek Java program banana hai jo check kare ki student university admission ke liye eligible hai ya nahi. Program user se niche wali details puche:
_____________________________________________________________________________

<img width="411" height="477" alt="image" src="https://github.com/user-attachments/assets/8d2ba327-396e-449a-af02-bf78e2a882c6" />


_____________________________________________________________________________



Student name

Class 12th percentage

Entrance exam score

Category (General, OBC, SC, ST)

Eligibility Rules:
A student is eligible if:

Class 12th percentage must be 60% or above

Entrance exam score must be 50 or above

Category relaxation:

General: No relaxation

OBC: 5% relaxation in 12th

SC: 10% relaxation in 12th

ST: 15% relaxation in 12th

Meaning:
If someone is SC and has 12th percentage 50, toh eligible hoga because 60 - 10 = 50 required.

Output:
Program should clearly print:

Student Name

Admission Status: Eligible or Not Eligible

Reason if not eligible

Sample Input 1

Rohan
12th Percentage: 72
Entrance Score: 55
Category: General

Sample Output 1

Student Name: Rohan
Status: Eligible
Reason: Meets all criteria

Sample Input 2

Priya
12th Percentage: 48
Entrance Score: 60
Category: SC

Sample Output 2

Student Name: Priya
Status: Eligible
Reason: Eligible due to category relaxation
