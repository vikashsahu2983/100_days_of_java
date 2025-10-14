Day 029 - Program -  Stock Profit-Loss Analyzer
__________________________________________________
<img width="476" height="604" alt="image" src="https://github.com/user-attachments/assets/333842f7-8dbe-418d-9dbd-8dca436d2329" />

__________________________________________________
Problem Statement

Create a Java program named Stock Profit/Loss Analyzer that allows a user to determine whether they have made a profit or loss on a stock investment.

The program should:

Ask the user to enter the company name.

Ask for the buying price per stock.

Ask for the number of stocks purchased.

Ask for the current market price per stock.

Calculate and display:

Total investment

Current market value

Profit or loss amount

Profit or loss percentage

A message showing whether the user is in profit, loss, or break-even.

Class Design

Class Name: Stock

Data Members: companyName, buyingPrice, stockCount, currentPrice

Constructor: To initialize all data members.

Method: calculateProfitLoss() — performs calculations and displays results.

Class Name: StockProfitCalculator

Contains the main() method.

Takes user input using the Scanner class.

Creates a Stock object and calls its calculateProfitLoss() method.

Formulas Used
Total Investment = buyingPrice × stockCount  
Current Value = currentPrice × stockCount  
Profit or Loss = Current Value − Total Investment  
Profit/Loss Percentage = (Profit or Loss / Total Investment) × 100

Sample Input 1
Enter company name: TCS
Enter buying price per stock: 3500
Enter number of stocks purchased: 10
Enter current price per stock: 3700

Expected Output 1
----- Stock Report -----
Company: TCS
Total Investment: 35000.0
Current Value: 37000.0
Profit: 2000.0 (5.71%)
