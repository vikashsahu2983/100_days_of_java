Day 13 - Program -Insurance Calculator
________________________________________
Program Questions - Write a program to calculate and display the insurance premium based on vehicle type,
vehicle age, and vehicle value. The program should validate the vehicle type and calculate the premium using predefined percentage rules. 
The program should also display the vehicle details along with the calculated premium amount.

Classes
1) Vehicle (BLC)
Attributes (private):
vehicleType (String)
vehicleAge (int)


Methods :-
setVehicleType(String vehicleType)
setVehicleAge(int vehicleAge)
getVehicleType()
getVehicleAge()
displayDetails() → Displays vehicle details (type and age).


2) InsurancePremium (BLC)
Attributes (private) :-
premiumAmount (double)


Methods :-
getPremiumAmount()
calculatePremium(Vehicle vehicle, double vehicleValue) → static method that calculates premium based on rules.


For Car:
Age < 5 years: Premium = 5% of vehicle value
Age 5 - 10 years: Premium = 7%
Age > 10 years: Premium = 10%


For Motorcycle:
Age < 3 years: Premium = 3%
Age 3 - 8 years: Premium = 5%
Age > 8 years: Premium = 8%


For Truck:
Age < 5 years: Premium = 6%
Age 5 - 10 years: Premium = 8%
Age > 10 years: Premium = 12%


3) InsuranceCalculator (ELC – Execution/Driver Class)

Methods:
main(String[] args) → Takes input from the user:
vehicleType (Car / Motorcycle / Truck)
vehicleAge (int)
vehicleValue (double)
Creates a Vehicle object.
Calls InsurancePremium.calculatePremium() method.


Displays either:
Vehicle details + Insurance premium (if valid)
"Invalid vehicle type" (if invalid).

Input Format: - String vehicleType (Car/Motorcycle/Truck) - int
vehicleAge - double vehicleValue

Output Format: - Print premium details

Note: - For String input, do not use nextLine(). Use next() only.
_______________________
Sample Input
Car 6 200000
Sample Output
14000.0
_________________________
