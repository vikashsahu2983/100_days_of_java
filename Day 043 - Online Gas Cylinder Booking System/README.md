Day 043 – Online Gas Cylinder Booking System

Create a Java program that simulates an Online Gas Cylinder Booking System. The program should collect booking details from the user, calculate the total amount, and generate a final booking receipt.

_______________________________________________________________
<img width="374" height="570" alt="image" src="https://github.com/user-attachments/assets/e5ddab7e-50e9-4635-9dca-e43a1d07696e" />
_______________________________________________________________

Requirements
1. User Inputs:

The program should take the following details from the user:

Customer Name

Customer Mobile Number

Address

Gas Agency Name

Cylinder Type (Domestic or Commercial)

Number of Cylinders

Preferred Delivery Date

Any Additional Services (Yes/No)

If Yes:

Add Service Charge: 50

2. Cylinder Price:

Domestic Cylinder: 950 per cylinder

Commercial Cylinder: 1500 per cylinder

3. Delivery Charge:

Standard delivery: 40

If number of cylinders > 2 → Delivery charge = 70

4. Total Calculation:

Total Cylinder Cost = Number of cylinders × Cylinder price

Additional Service Charge (if any)

Delivery Charge

GST = 5% of the total amount (before GST)

Final Amount = Cylinder Cost + Service Charge + Delivery Charge + GST

5. Final Output:

Display a complete booking receipt with:

Customer details

Cylinder type

Number of cylinders

Cylinder cost

Service charge

Delivery charge

GST

Total payable amount

Booking Status: “Booking Confirmed”

Sample Input

Customer Name: Suresh
Mobile: 9876543210
Address: Hyderabad
Gas Agency: HP Gas
Cylinder Type: Domestic
Cylinders: 2
Delivery Date: 25-11-2025
Additional Service: Yes

Sample Output

Customer Name: Suresh
Mobile: 9876543210
Gas Agency: HP Gas
Cylinder Type: Domestic

Number of Cylinders: 2
Total Cylinder Cost: 1900
Service Charge: 50
Delivery Charge: 40
GST (5%): 99
Final Amount: 2089

Booking Status: Booking Confirmed
