Day 019 - Problem - Railway Ticket Booking System 
_________________________________________________
Question: Indian Railways wants to build a simple ticket booking system for passengers.
You are required to design a program in Java that takes passenger details (like name, age, train number, origin, destination, distance, and coach) from the user and generates a ticket summary.
The system should calculate the ticket price based on the distance travelled, apply a 15% discount, and show the final payable amount.


Ticket Price Rules:
Distance 0–100 km → ₹200
Distance 101–200 km → ₹400
Distance 201–300 km → ₹600
Distance 301–400 km → ₹800
Distance 401–500 km → ₹1000
Distance >500 km → ₹1500


Requirements:
Create a class TrainTicket with instance variables for name, age, train number, origin, destination, coach, and distance.


Define methods:
ticketPrice() → calculates ticket price based on distance.
calculateDiscount() → applies 15% discount on ticket price.
totalPrice() → calculates final payable amount after discount.
displayTicketDetail() → displays the ticket summary.


Create a Passenger class with main() method to take user input using Scanner, create TrainTicket object, and display ticket details.


_______________________________________________
Sample Input (user input during program run):
welcome to the indian reilways
ticket booking page
passenger name : Ramesh Kumar
passenger age : 28
Train number : 12567
enter origin Station : Delhi
Enter destination Station : Mumbai
Total distance : 350
enter class of ticket : Sleeper

Expected Output:

-----ticket detail-----
name : Ramesh Kumar
age : 28
Train Number : 12567
Origin : Delhi
destination : Mumbai
class : Sleeper
Total distance : 350
Total Ammount : 800.0
discount ammount : 120.0
Ammount to be paid : 680.0
thank for using Indian Railways
________________________________________________

Explanation:

Passenger entered distance = 350 km.
According to rules, base price = ₹800.
Discount = 15% of 800 = ₹120.
Final payable amount = 800 - 120 = ₹680.

Ticket summary is displayed with all passenger details and calculated values.
