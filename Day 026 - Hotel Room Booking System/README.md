Day 026 - Program - Hotel Room Booking System
______________________________________________________________________

<img width="550" height="786" alt="image" src="https://github.com/user-attachments/assets/461fc5fe-de35-4608-b56c-786624accaf3" />

______________________________________________________________________

Problem Statement:
You have been hired to design a Hotel Room Booking System for Sunshine Grand Hotel.
The hotel wants to computerize its billing process. When a customer books a room, the program should take customer details and booking information, then generate a detailed bill.

This system must calculate the total payable amount based on the room type, number of days stayed, and additional service charge. It should also display hotel and customer details neatly.

Requirements:
1. Base Class: Hotel

Static variable: hotelName (common for all customers)

Instance variables: cityName, hotelRating

Non-parameterized method: showHotelInfo() → displays hotel details.

2. Derived Class: RoomBooking

Inherits from Hotel.

Instance variables: customerName, mobileNumber, roomType, daysStayed, extraServiceCharge.

Parameterized method: calculateBill(String roomType, int daysStayed, double extraServiceCharge)

Should determine room rate based on room type:

Standard → ₹2000 per night

Deluxe → ₹3500 per night

Suite → ₹5000 per night

Calculate total = (roomRate × daysStayed) + extraServiceCharge.

Non-parameterized method: displayBill() → displays complete formatted bill.

Concepts to Use

✅ Static variables
✅ Instance variables
✅ Parameterized & Non-parameterized methods
✅ Inheritance (Hotel → RoomBooking)

Sample Input 1
Enter Customer Name: Rahul Mehta
Enter Mobile Number: 9876543210
Enter City: Mumbai
Enter Room Type (Standard/Deluxe/Suite): Deluxe
Enter Days Stayed: 3
Enter Extra Service Charge: 500

Expected Output 1
----------- HOTEL BOOKING RECEIPT -----------
Hotel Name: Sunshine Grand Hotel
Hotel Rating: 4.5 ★
City: Mumbai
---------------------------------------------
Customer Name: Rahul Mehta
Mobile Number: 9876543210
Room Type: Deluxe
Days Stayed: 3
Room Rate: ₹3500 per night
Extra Service Charge: ₹500
---------------------------------------------
Total Bill: ₹11000
---------------------------------------------
Thank you, Rahul Mehta, for staying with Sunshine Grand Hotel!
We hope to see you again.
---------------------------------------------

Sample Input 2
Enter Customer Name: Neha Sharma
Enter Mobile Number: 9988776655
Enter City: Jaipur
Enter Room Type (Standard/Deluxe/Suite): Suite
Enter Days Stayed: 2
Enter Extra Service Charge: 0

Expected Output 2
----------- HOTEL BOOKING RECEIPT -----------
Hotel Name: Sunshine Grand Hotel
Hotel Rating: 4.5 ★
City: Jaipur
---------------------------------------------
Customer Name: Neha Sharma
Mobile Number: 9988776655
Room Type: Suite
Days Stayed: 2
Room Rate: ₹5000 per night
Extra Service Charge: ₹0
---------------------------------------------
Total Bill: ₹10000
---------------------------------------------
Thank you, Neha Sharma, for staying with Sunshine Grand Hotel!
We hope to see you again.
---------------------------------------------
