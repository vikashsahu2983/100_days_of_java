Day 013 - program - Car_Rental_Service
_________________________________________
Create a class CarRental with a constructor to initialize carName, dailyRate, and number of days.
Add a method getTotalCost() and another method showRentalDetails() to display rental summary.
Class Name:
CarRental
Instance Variables:
- carName (String)
- dailyRate (double)
- days (int)
Constructor:
- CarRental(String carName, double dailyRate, int days)
Methods:
- getTotalCost() → returns dailyRate × days
- showRentalDetails() → prints rental details
Main Class:
- CarMain
Input Format:
Car Name (String)
Daily Rate (double)
Number of Days (int)
Output Format:
Car: <carName>, Days: <days>, Total Cost: <totalCost>
Note:
Use Scanner with next() for String input.
Sample Input
ToyotaCamry
45
3
Sample Output
Car: ToyotaCamry, Days: 3, Total Cost: 135.0
