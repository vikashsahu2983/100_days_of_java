Day 047 – Courier Delivery Charge Estimator
____________________________________________________
<img width="647" height="655" alt="image" src="https://github.com/user-attachments/assets/4797a8bb-14b7-4789-8f88-0f195035df08" />

____________________________________________________

Create a Java program that calculates the total courier delivery cost. The program should take multiple inputs from the user, including package details, service type, and optional add-ons. Based on these inputs, compute and display the final payable amount.

Required Inputs

Sender Name

Receiver Name

Package Weight (kg)

Delivery Distance (km)

Delivery Speed

Normal

Express

Super Express

Package Type

Documents

Electronics

Fragile Item

Others

Insurance Required (Yes / No)

COD Required (Yes / No)

Charging Rules

1. Weight Charge

0 to 5 kg → 20 Rs per kg

6 to 20 kg → 15 Rs per kg

Above 20 kg → 10 Rs per kg

2. Distance Charge

5 Rs per km

3. Delivery Speed Charge

Normal → 0 Rs

Express → 50 Rs

Super Express → 100 Rs

4. Package Type Extra Charge

Documents → 0 Rs

Electronics → 50 Rs

Fragile Item → 100 Rs

Others → 20 Rs

5. Insurance Charge

If yes → Additional 2% of (Weight Charge + Distance Charge)

6. COD Charge

If yes → Flat 30 Rs

Final Total = Weight Charge + Distance Charge + Speed Charge + Package Type Charge + Insurance Charge + COD Charge

Sample Input 1

Sender Name: Rohan
Receiver Name: Aarav
Weight: 4 kg
Distance: 20 km
Speed: Normal
Package Type: Documents
Insurance: No
COD: No

Sample Output 1

Total Courier Charge: 200 Rs

Sample Input 2

Sender Name: Meera
Receiver Name: Ankit
Weight: 12 kg
Distance: 75 km
Speed: Express
Package Type: Fragile Item
Insurance: Yes
COD: Yes

Sample Output 2

Total Courier Charge: 635 Rs
