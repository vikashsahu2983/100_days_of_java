Day 019 - Problem - Train Ticket with Age-Based Fare
____________________________________________________________
Problem:
Create a Ticket class with:
•	Instance variables: passengerName, trainNo, fare.

•	Method applyAgeDiscount(int age) with rules:
o	Age < 12 → 50% Discount
o	Age ≥ 60 → 30% Discount
o	Otherwise → No Discount

Sample Input:
Passenger: Ravi
Age: 10
Fare: ₹400

Sample Output:
Train: 12567
Passenger: Ravi (Age: 10)
Original Fare: ₹400
Discounted Fare: ₹200
