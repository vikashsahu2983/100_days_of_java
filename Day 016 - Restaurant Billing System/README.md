Day 016 - Program - Restaurant Billing System
_________________________________________________

Question: Write a Java program to create a Restaurant Billing System with the following requirements:
Ask the user to enter the Restaurant Name.

Display a fixed menu with items and prices:
Pizza → ₹200
Burger → ₹150
Pasta → ₹120
Sandwich → ₹100
For each customer:
Take Customer Name, Food Item (from menu), and Quantity.
Calculate Base Amount = (Price × Quantity).
Add GST at 5%.
Apply Discount at 10%.
Display the Final Bill.
Handle at least 2 customers.
If an invalid food item is entered, display an error message.
Sample Input / Output

Input:
enter the name of the Restaurant : Foodie Hub
please enter your name : Ramesh
Menu 
 Dish ---- price 
 Pizza ---> 200 
 Burger ---> 150 
 Pasta ---> 120 
 Sandwich ---> 100 

enter the food from above menu : Pizza
enter the qty of the food : 2

please enter your name : Suresh
Menu 
 Dish ---- price 
 Pizza ---> 200 
 Burger ---> 150 
 Pasta ---> 120 
 Sandwich ---> 100 

enter the food from above menu : Burger
enter the qty of the food : 3

Output:
----- Bill Receipt -----
Customer: Ramesh
Food Item: Pizza
Quantity: 2
Base amount :400.0
GST (5%) :20.0
Discount (10%) :40.0
Final Bill :380.0
------------------------

----- Bill Receipt -----
Customer: Suresh
Food Item: Burger
Quantity: 3
Base amount :450.0
GST (5%) :22.5
Discount (10%) :45.0
Final Bill :427.5
------------------------

Input Output Based On Real Code : -
________________________________________________________________
Input : --------
enter the name of the Restaurant : Taza kitchen
please enter your name :vikash sahu
Menu
 Dish ---- price
 Pizza ---> 200
 Burger ---> 150
 Pasta ---> 120
 Sandwich ---> 100

enter the food from above menu :burger
enter the qty of the food :5

Output : -----

----- Bill Receipt -----
Customer: vikash sahu
Food Item: burger
Quantity: 5
Base amount :750.0
GST (5%) :37.5
Discount (10%) :75.0
Final Bill :712.5
------------------------
please enter your name :

<img width="258" height="268" alt="image" src="https://github.com/user-attachments/assets/cf6b30b5-d40d-437e-8815-8c391526a987" />
