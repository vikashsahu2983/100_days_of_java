Day 030 - Program -  Healthy Human Weight Predictor

Write a Java program named HealthyWeightPredictor to predict the healthy weight of a person based on their age.
The program should take the age as input and use the following conditions to estimate a healthy weight:
______________________________________________________________________________________________________________________
<img width="748" height="322" alt="image" src="https://github.com/user-attachments/assets/02ed3691-8a73-4cfa-b7e6-9abc16bf0a46" />
______________________________________________________________________________________________________________________

Age Range	Formula to Calculate Weight (in kg)
1–10 years	(age × 2) + 8
11–20 years	(age × 2.5) + 5
21–60 years	(age × 0.9) + 45
Above 60 years	(age × 0.5) + 40

If the user enters a non-positive age (0 or negative), display:
Invalid age. Please enter a positive number.

The program should display the predicted healthy weight in kilograms (kg) up to one decimal place.

Sample Input 1:
Enter your age: 8

Sample Output 1:
Predicted healthy weight for age 8 is approximately 24.0 kg.

Sample Input 2:
Enter your age: 25

Sample Output 2:
Predicted healthy weight for age 25 is approximately 67.5 kg.
