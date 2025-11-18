Day 039 – Parking Lot Fee Calculator

Problem Statement:
A parking lot system needs a program that calculates the parking fee for a vehicle. The program should take the vehicle type, vehicle number, entry time, and exit time from the user.
Based on the total parking duration, the system should calculate the fee and print a complete bill.

______________________________________________________________________

<img width="441" height="489" alt="Screenshot 2025-11-18 095337" src="https://github.com/user-attachments/assets/cf272240-05ba-402b-9e92-d1ac4f492bfc" />
______________________________________________________________________


Fee Rules:
Car: ₹30 per hour
Bike: ₹15 per hour
Auto: ₹20 per hour

Your program should:

Ask the user for vehicle type (Car / Bike / Auto).

Ask the user for vehicle number.

Ask entry time in 24-hour format (like 9, 14, 18).

Ask exit time in 24-hour format.

Calculate total parking time in hours.

Calculate total fee based on vehicle type.

Print all details: vehicle type, number, entry time, exit time, parking duration, and total fee.

Sample Input 1:
Enter vehicle type: Car
Enter vehicle number: MP04AB1234
Enter entry time (hour): 10
Enter exit time (hour): 14

Sample Output 1:
Vehicle Type: Car
Vehicle Number: MP04AB1234
Entry Time: 10:00
Exit Time: 14:00
Total Time Parked: 4 hours
Parking Fee: ₹120

Sample Input 2:
Enter vehicle type: Bike
Enter vehicle number: TS09XY9911
Enter entry time (hour): 9
Enter exit time (hour): 11

Sample Output 2:
Vehicle Type: Bike
Vehicle Number: TS09XY9911
Entry Time: 9:00
Exit Time: 11:00
Total Time Parked: 2 hours
Parking Fee: ₹30
