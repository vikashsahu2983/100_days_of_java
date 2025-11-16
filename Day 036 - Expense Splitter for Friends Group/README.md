Day 036 - Program: Expense Splitter for Friends Group
_____________________________________________________________________________________
<img width="361" height="647" alt="image" src="https://github.com/user-attachments/assets/81e2c414-c9fa-48c1-bc37-9faa650e2d60" />

_____________________________________________________________________________________

Problem Statement:
Write a Java program that helps a group of friends split their shared expenses in a fair and transparent way. The program should ask the user how many friends are involved in the activity, then take each friend’s name and the amount they contributed. After collecting all details, the program must calculate the total expense, determine the fair share for each person, and compute how much each friend either owes or should receive.

Finally, the program should generate a clear settlement report that shows which friend needs to pay whom and how much. This will ensure the final distribution is fair for everyone.

Sample Input 1

Enter number of friends:
3
Enter name of friend 1:
Amit
Enter amount paid by Amit:
1200
Enter name of friend 2:
Riya
Enter amount paid by Riya:
300
Enter name of friend 3:
Vikash
Enter amount paid by Vikash:
500

Sample Output 1

Total Expense: ₹2000.00
Each Person Should Pay: ₹666.67

Settlements:
Riya pays ₹366.67 to Amit
Vikash pays ₹166.66 to Amit

All expenses are settled.

Sample Input 2

Enter number of friends:
4
Enter name of friend 1:
Neha
Enter amount paid by Neha:
800
Enter name of friend 2:
Rahul
Enter amount paid by Rahul:
200
Enter name of friend 3:
Simran
Enter amount paid by Simran:
1000
Enter name of friend 4:
Arjun
Enter amount paid by Arjun:
0

Sample Output 2

Total Expense: ₹2000.00
Each Person Should Pay: ₹500.00

Settlements:
Rahul pays ₹300.00 to Simran
Arjun pays ₹500.00 to Simran
Neha receives ₹200.00 from Simran

All expenses are settled.
