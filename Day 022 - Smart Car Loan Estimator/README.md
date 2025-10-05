Day 022 - Program - Smart Car Loan EMI Estimator
___________________________________________________
You need to write a Java program that calculates the monthly EMI (Equated Monthly Installment) for a car loan using a class called Car.

<img width="419" height="534" alt="image" src="https://github.com/user-attachments/assets/f4283cbd-9766-48ed-a086-78c2225a2be1" />


🚗 What You Need to Do
You must create a Car class with:

Instance Variables (non-static):

brand → to store car name (like “Honda”)
price → to store car price (like 600000)
Static Variable (common to all objects):
loanInterestRate → the loan interest percentage (like 8 for 8%)

Methods:
setDetails(String brand, double price) → to set the details of the car using this keyword.
calculateEMI(int years) → to calculate the monthly EMI using a given formula.

📘 Formula Given
\text{EMI} = \frac{(Price + (Price × Interest% × Years))}{Years × 12}

Let’s understand this formula:
Price × Interest% × Years → gives the total interest amount for the whole loan period.
Price + (that interest) → gives the total amount you will pay back.
(Years × 12) → converts the total time into months.
Finally, dividing gives monthly EMI.

💡 Sample Input
Brand: Honda
Price: 600000
Years: 5
Interest: 8%

🧮 Step-by-Step Calculation
Let’s calculate it manually using the formula:

Given:
Price = 600000
Years = 5
Interest = 8% → 8/100 = 0.08

Step 1: Calculate total interest
= Price × Interest × Years
= 600000 × 0.08 × 5
= 600000 × 0.4
= 240000

Step 2: Add to price (total amount to pay)
= 600000 + 240000
= 840000

Step 3: Divide by total months (Years × 12)
= 840000 / (5 × 12)
= 840000 / 60
= ₹14,000 per month

So your EMI = ₹14,000/month

🖥️ Sample Output
Car: Honda
Price: ₹600000
Years: 5
EMI: ₹14000.0 per month
