Day 042 – Smart Phone Repair Service Billing System
Create a Java program that manages the billing process for a Smart Phone Repair Shop. The program should take all the required details from the user and generate a complete repair bill.
________________________________________________________
<img width="324" height="655" alt="image" src="https://github.com/user-attachments/assets/fc3834d7-aeb1-40c2-a8f4-f5d31b6f45a7" />
________________________________________________________

Requirements
1. Take the following repair details from the user:

Customer Name

Mobile Number

Phone Brand (Samsung, Apple, Vivo, Oppo, etc.)

Model Name

IMEI Number

Problem Type (Screen, Battery, Software, Speaker, Camera, etc.)

Estimated Repair Time in hours

Number of parts replaced

For each part: Part Name and Part Price

2. Labour Charges:

If repair time ≤ 2 hours → Labour charge = 300

If repair time is between 2–5 hours → Labour charge = 500

If repair time > 5 hours → Labour charge = 800

3. Total Parts Cost:

Add the price of all replaced parts.

4. GST:

GST = 18% of (Total Parts Cost + Labour Charge)

5. Final Output:

The program should display a clear and well-formatted bill containing:

Customer and phone details

List of replaced parts with their prices

Total parts cost

Labour charge

GST amount

Final bill amount

Status: “Ready for Delivery”

Sample Input

Customer Name: Rahul
Mobile Number: 9876543210
Phone Brand: Samsung
Model: A52
IMEI: 1234567891011
Problem Type: Screen
Estimated Time: 3
Number of Parts: 2
Part 1: Display – 3500
Part 2: Tempered Glass – 150

Sample Output

Customer Name: Rahul
Phone: Samsung A52
IMEI: 1234567891011
Problem: Screen

Parts Used:
Display – 3500
Tempered Glass – 150

Total Parts Cost: 3650
Labour Charge: 500
GST (18%): 747
Final Bill Amount: 4897
Status: Ready for Delivery
