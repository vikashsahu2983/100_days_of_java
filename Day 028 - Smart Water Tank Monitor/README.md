Day 028 - program -  Smart Water Tank Monitor
__________________________________________________

<img width="363" height="637" alt="image" src="https://github.com/user-attachments/assets/5ac705af-6479-41ff-9a4b-6d328f7e1a9d" />


___________________________________________________

Problem Statement:
Ek smart water tank monitoring system banaiye jo ek ya zyada tanks ke water level ko monitor kare. System ko tank ki total capacity aur current water level input leni hai. Agar water level 20% se kam ho to refill alert bheje. Agar current level tank capacity se zyada ho (overflow) to overflow alert bheje. Har tank ke liye percentage display karein aur corresponding alert message print karein.

Requirements:

Use a class WaterTank with attributes: name (String), capacity (double), currentLevel (double).

WaterTank mein method checkLevel() ho jo percentage calculate kare aur messages print kare:

percentage = (currentLevel / capacity) * 100

Agar currentLevel > capacity → print "Alert: Overflow in <TankName>! Reduce input or check valve."

Else agar percentage < 20% → print "Alert: Refill needed in <TankName>!"

Else → print "Level normal in <TankName>."

Program multiple tanks ko dynamically handle kare (user se number of tanks lega).

Input validation: capacity > 0 hona chahiye — agar invalid ho to user ko message dekar us tank ke liye dobara input lene ka option de sakte hain (simple validation implemented).

Output percentage ko one decimal place tak format karein.

Input Format:

First line: Number of tanks n.

For each tank:

Tank name (String)

Tank capacity (double)

Current water level (double)

Output Format:

For each tank:

Tank: <name> | Level: <percentage>%

Alert message (overflow / refill needed / level normal)

Sample Input 1:
Enter number of tanks: 2

Enter details for tank 1
Tank name: RoofTank
Tank capacity (liters): 1000
Current water level (liters): 150

Enter details for tank 2
Tank name: BasementTank
Tank capacity (liters): 2000
Current water level (liters): 1800

Sample Output 1:
--- Water Tank Status ---
Tank: RoofTank | Level: 15.0%
Alert: Refill needed in RoofTank!

Tank: BasementTank | Level: 90.0%
Level normal in BasementTank.

Sample Input 2:
Enter number of tanks: 1

Enter details for tank 1
Tank name: OfficeTank
Tank capacity (liters): 500
Current water level (liters): 520

Sample Output 2:
--- Water Tank Status ---
Tank: OfficeTank | Level: 104.0%
Alert: Overflow in OfficeTank! Reduce input or check valve.
