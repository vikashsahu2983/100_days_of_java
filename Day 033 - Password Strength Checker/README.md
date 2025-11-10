Day 033 - Program - Password Strength Checker
______________________________________________________

<img width="464" height="465" alt="image" src="https://github.com/user-attachments/assets/d83040d0-e68d-4205-863f-f81641b5cd36" />

Problem Statement:

Write a Java program to check the strength of a password entered by the user using regex, loops, and conditional statements.

The program should:

Ask the user to enter their name and a password.

Verify the password strength based on the following conditions:

Criteria	Requirement
Length	Must be between 8 and 20 characters
Lowercase Letter	At least 1 lowercase letter (a–z)
Uppercase Letter	At least 1 uppercase letter (A–Z)
Digit	At least 1 numeric digit (0–9)
Special Character	At least 1 special character from `!@#$%^&*()-_+=[]{}
Space	No spaces allowed
Repetition	No more than 2 identical consecutive characters (like aaa not allowed)

Display whether the password is Strong, Moderate, or Weak according to the following logic:

Strong: Meets all 7 rules.

Moderate: Meets at least 4 of the rules (including length).

Weak: Meets less than 4 rules or fails length condition.

Print the current date and time of the password evaluation.

✅ Password Strength Rules Summary
Strength	Conditions Met
Strong	All 7 rules
Moderate	4–6 rules
Weak	Less than 4 rules
🧮 Sample Input 1
Enter your Name: Vikash Sahu  
Enter your Password: MyP@ssw0rd123

💡 Sample Output 1
100_Days_Of_Java

===== PASSWORD STRENGTH CHECKER =====
===== RESULT =====
Date & Time: 10-11-2025 13:15:45
User Name: Vikash Sahu
Password Status: STRONG
Reason: Meets all required conditions.

🧮 Sample Input 2
Enter your Name: Rohan Verma  
Enter your Password: pass1234

💡 Sample Output 2
100_Days_Of_Java

===== PASSWORD STRENGTH CHECKER =====
===== RESULT =====
Date & Time: 10-11-2025 13:17:20
User Name: Rohan Verma
Password Status: WEAK
Reason: Missing uppercase and special character.
