Day 042 – Toll Tax Billing System

A toll plaza wants a billing system that calculates the total toll amount for a vehicle based on the distance it has traveled and the type of vehicle.
Create a Java program that asks the user for:
_____________________________________________________________________________
<img width="485" height="445" alt="image" src="https://github.com/user-attachments/assets/7989db8d-8677-4ef6-be02-8542a1a3d87a" />

_____________________________________________________________________________
Vehicle Number

Vehicle Type (Car, Truck, Bus, Bike)

Distance traveled in kilometers

Each vehicle type has a fixed toll rate per kilometer:

Car → Rs 2.5 per km

Truck → Rs 5.0 per km

Bus → Rs 4.0 per km

Bike → Rs 1.0 per km

Your program should:

Validate the vehicle type

Calculate the total toll amount

Print a professional toll receipt showing

Vehicle number

Vehicle type

Distance traveled

Rate per km

Total toll amount

If the vehicle type is invalid, show an error message and stop the program.

Sample Input & Output 1

Input:
Enter Vehicle Number: AP09AB1234
Enter Vehicle Type (Car / Truck / Bus / Bike): Car
Enter Distance Travelled in KM: 120

Output:
----- Toll Tax Receipt -----
Vehicle Number: AP09AB1234
Vehicle Type: Car
Distance Travelled: 120 KM
Rate Per KM: 2.5
Total Toll Amount: Rs 300.0

Sample Input & Output 2

Input:
Enter Vehicle Number: TS08ZZ9090
Enter Vehicle Type (Car / Truck / Bus / Bike): Truck
Enter Distance Travelled in KM: 75

Output:
----- Toll Tax Receipt -----
Vehicle Number: TS08ZZ9090
Vehicle Type: Truck
Distance Travelled: 75 KM
Rate Per KM: 5.0
Total Toll Amount: Rs 375.0
