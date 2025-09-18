DAY 4 - Problem - Mobile_Store_Billing_System
________________________________________________________
Q. Mobile Store Billing System with Tax and Discount
________________________________________________________
A mobile store offers discounts based on the price of the smartphone and also adds 18% GST to the discounted amount.

  Price                Range Discount
Up to ₹20,000               10%
₹20,001 to ₹40,000          15%
₹40,001 to ₹70,000          22%
More than ₹70,000           28%

Tasks:
Define a class MobilePurchase with the following:

Data Members:-
customer_name: Name of the customer
mobile_price: Original price of the mobile
discount: Calculated discount
final_price: Final price after applying discount and GST

Member Methods:-
A parameterized constructor to initialize the name and mobile price.
A method to calculate:
Discount based on the price.
GST at 18% on the discounted price.
Final price = discounted price + GST

A method to display:-
Customer name
Original price
Discount amount
GST amount
Final amount to be paid
Write the main method to create an object, accept inputs, and display the full bill.

Sample Input :-----------
PawanKalyan
15000


Sample Output :------------

---- Mobile Store Bill ----
Customer Name: PawanKalyan
Original Price: ₹15000.0
Discount: ₹1500.0
Price After Discount: ₹13500.0
GST (18%): ₹2430.0
Final Amount Payable: ₹15930.0
