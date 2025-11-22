Day 050 – Online Grocery Order Summary Generator
____________________________________________________________
<img width="388" height="737" alt="image" src="https://github.com/user-attachments/assets/a90c7df0-7ed9-46df-99bc-55d8d02c8682" />

____________________________________________________________


Create a Java program that generates a complete order summary for an online grocery purchase.
The program should take product details from the user, calculate the total bill, and display a clear summary of the order.

Required Inputs

Your program must take the following inputs from the user:

Customer Name

Mobile Number

Delivery Address

Number of Items Ordered

For each item:

Item Name

Quantity

Price per unit

Delivery Charge

Payment Mode

UPI

Cash on Delivery

Net Banking

Card Payment

Program Requirements

Ask for customer details first.

Then ask how many items the customer wants to order.

For each item, take item name, quantity, and unit price.

Calculate:

Item total (quantity × price)

Grand total of all items

Add delivery charges

Display a clean order summary that includes:

Customer info

Item-wise billing table

Total item amount

Delivery charge

Final payable amount

Payment mode

End with a thank-you message.

Sample Input 1

Customer Name: Rohan
Mobile: 9876543210
Address: Delhi
Number of Items: 2

Item 1 Name: Rice
Quantity: 2
Price per unit: 50

Item 2 Name: Sugar
Quantity: 1
Price per unit: 40

Delivery Charge: 30
Payment Mode: UPI


Sample Output 1

================= ORDER SUMMARY =================
Customer: Rohan
Mobile: 9876543210
Address: Delhi

Items Ordered:

Rice – 2 × 50 = 100

Sugar – 1 × 40 = 40

Total Item Cost: 140
Delivery Charge: 30
Final Payable Amount: 170

Payment Mode: UPI
Thank you for shopping with us!
Sample Input 2

Customer Name: Priya
Mobile: 9123456780
Address: Mumbai
Number of Items: 3

Item 1: Bread – 1 × 30
Item 2: Milk – 2 × 25
Item 3: Oil – 1 × 120

Delivery Charge: 40
Payment Mode: Cash on Delivery

Sample Output 2

================= ORDER SUMMARY =================
Customer: Priya
Mobile: 9123456780
Address: Mumbai

Items Ordered:

Bread – 1 × 30 = 30

Milk – 2 × 25 = 50

Oil – 1 × 120 = 120

Total Item Cost: 200
Delivery Charge: 40
Final Payable Amount: 240

Payment Mode: Cash on Delivery
Thank you for shopping with us!
