Day 020 - Problem Water Bill with Tiered Pricing
_________________________________________________________
Problem Statement:
Design a program for a Water Bill Management System that calculates the monthly water bill for a household based on water consumption and also maintains customer details.

The system should:
Take customer details as input:
Customer Name
Number of Family Members
Address
House Number
Bill Number
Connection Number

Take the water consumption in liters as input.
Calculate the bill using the following tiered pricing rules:
If consumption is ≤ 200 liters → rate is ₹2 per liter
If consumption is 201–500 liters → rate is ₹3 per liter
If consumption is > 500 liters → rate is ₹5 per liter
Display the complete water bill including customer details and the total payable amount.

Input Format:
Customer Name (String)
Number of Family Members (Integer)
Address (String)
House Number (String/Integer)
Bill Number (Integer)
Connection Number (Integer)
Liters of Water Consumed (Integer)

Output Format:

Display a formatted water bill with all the details:

------------------------------------
          WATER BILL
------------------------------------
Bill Number       : <bill_number>
Connection Number : <connection_number>
House Number      : <house_number>
Customer Name     : <name>
Family Members    : <number_of_members>
Address           : <address>
Water Consumed    : <liters> liters
Total Amount      : ₹<amount>
------------------------------------

Sample Input:
Name: Ramesh Sharma
Family Members: 5
Address: 12/A, Gandhi Nagar, Bhopal
House Number: H-102
Bill Number: 45231
Connection Number: 789654
Liters: 550

Sample Output:
------------------------------------
          WATER BILL
------------------------------------
Bill Number       : 45231
Connection Number : 789654
House Number      : H-102
Customer Name     : Ramesh Sharma
Family Members    : 5
Address           : 12/A, Gandhi Nagar, Bhopal
Water Consumed    : 550 liters
Total Amount      : ₹2750
------------------------------------
