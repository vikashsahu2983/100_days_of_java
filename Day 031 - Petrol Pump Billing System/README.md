Day 031 - Program - Write a Java program to create a Petrol Pump Billing System.
________________________________________________________________________________________
<img width="589" height="718" alt="image" src="https://github.com/user-attachments/assets/7ece1c8f-d6ec-4b12-b36d-516cd33992c2" />
________________________________________________________________________________________

The program should take the following inputs from the user:

Petrol Pump Name

Number of Liters filled

Price per Liter

Your program should then calculate the total cost and display a formatted receipt showing all the entered details, current date and time, and the total amount to be paid.

Requirements:

Use Scanner to take inputs.

Use LocalDateTime and DateTimeFormatter to display current date and time.

Display all outputs in a neatly formatted receipt style.

Formula:
Total Amount = Number of Liters × Price per Liter

Sample Input 1:
Enter Petrol Pump Name: Indian Oil
Enter number of liters: 5
Enter price per liter (RS.): 108.5

Sample Output 1:
100_Days_Of_Java

===== WELCOME TO PETROL PUMP BILLING SYSTEM =====
Enter Petrol Pump Name: Indian Oil
Enter number of liters: 5
Enter price per liter (RS.): 108.5

----------- RECEIPT -----------
Petrol Pump: Indian Oil
Date & Time: 29-10-2025 14:12:45
-------------------------------
Liters: 5.00 L
Price per Liter: ₹108.50
-------------------------------
Total Amount: ₹542.50
-------------------------------
Thank you! Drive Safe!
-------------------------------

Sample Input 2:
Enter Petrol Pump Name: Bharat Petroleum
Enter number of liters: 12.75
Enter price per liter (RS.): 97.25

Sample Output 2:
100_Days_Of_Java

===== WELCOME TO PETROL PUMP BILLING SYSTEM =====
Enter Petrol Pump Name: Bharat Petroleum
Enter number of liters: 12.75
Enter price per liter (RS.): 97.25

----------- RECEIPT -----------
Petrol Pump: Bharat Petroleum
Date & Time: 29-10-2025 14:15:38
-------------------------------
Liters: 12.75 L
Price per Liter: ₹97.25
-------------------------------
Total Amount: ₹1239.94
-------------------------------
Thank you! Drive Safe!
-------------------------------
