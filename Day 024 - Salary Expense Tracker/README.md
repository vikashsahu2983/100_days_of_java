Day 024 - Program - Salary Expense Tracker

Write a Java program that helps a user analyze their monthly salary and expenses.

<img width="542" height="766" alt="image" src="https://github.com/user-attachments/assets/0fa0f426-2010-42f5-84e2-17a5cb1a4af8" />

Requirements:

The program should first ask the user to enter their total salary.

Then ask how many different categories of expenses they have.

For each category, the program should ask:

The name of the expense (e.g., Rent, Food, Travel).

The amount spent on that expense.

After collecting all inputs, the program should display:

Each expense name, amount, and its percentage share of the salary.

The total expenses (with percentage).

The remaining amount of the salary (with percentage).

The program should also display a simple bar chart representation (text-based) using * to visualize which category consumed how much percentage of the salary.

Input Format:

First line: Total salary (integer or decimal).

Second line: Number of expense categories (integer).

Next n pairs of lines:

Name of the expense (string).

Amount of the expense (integer or decimal).

Output Format:

A detailed expense report showing:

Expense name, amount, and percentage of salary.

Total expenses with percentage.

Remaining amount with percentage.

A text-based bar chart for visual representation.

Sample Input: Enter your total salary: 50000
Enter number of expense categories: 3
Enter name of expense 1: Rent
Enter amount for Rent: 15000
Enter name of expense 2: Food
Enter amount for Food: 10000
Enter name of expense 3: Shopping
Enter amount for Shopping: 5000

Sample Output: ----- Expense Report ----- Rent: 15000.00 (30.00% of salary) Food: 10000.00 (20.00% of salary) Shopping: 5000.00 (10.00% of salary)
Total Expenses: 30000.00 (60.00% of salary) Remaining Amount: 20000.00 (40.00% of salary)

----- Expense Chart ----- Rent : ********************** (30%) Food : ************ (20%) Shopping : ***** (10%) Remaining : *************** (40%)

