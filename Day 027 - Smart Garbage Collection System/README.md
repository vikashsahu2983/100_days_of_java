Day 027 - Program - Smart Garbage Collection System
_____________________________________________________

<img width="358" height="571" alt="image" src="https://github.com/user-attachments/assets/d6615cca-fbaf-403c-b889-7ec21c80c289" />

______________________________________________________

Problem Statement:
A city wants to implement a Smart Garbage Collection System to monitor garbage bins in different areas. You need to write a Java program that:

Takes input for multiple areas.

Each area has a garbage bin with a total capacity and a current garbage amount.

Calculates the percentage of the bin filled.

If the bin is more than 80% full, prints an alert: "Truck needed in <Area Name>!".

Otherwise, prints: "No alert needed.".

Finally, display the garbage bin status for all areas.

Requirements:

Use a class GarbageBin with attributes for area name, capacity, and current load.

Include a method checkCapacity() that calculates the percentage and prints alerts.

Use an array of GarbageBin objects to store multiple areas dynamically.

Input Format:

First line: Number of areas (n).

For each area:

Area name

Bin capacity

Current garbage amount

Output Format:

For each area:

Area: <Area Name> | Bin Capacity: <percentage>%

Alert if capacity > 80%

Sample Input 1:

Enter number of areas: 2

Enter details for area 1
Area name: Sector 1
Bin capacity: 100
Current garbage amount: 85

Enter details for area 2
Area name: Sector 2
Bin capacity: 150
Current garbage amount: 100


Sample Output 1:

--- Garbage Bin Status ---
Area: Sector 1 | Bin Capacity: 85.0%
Alert: Truck needed in Sector 1!
Area: Sector 2 | Bin Capacity: 66.66666666666666%
No alert needed.


Sample Input 2:

Enter number of areas: 1

Enter details for area 1
Area name: Downtown
Bin capacity: 200
Current garbage amount: 170


Sample Output 2:

--- Garbage Bin Status ---
Area: Downtown | Bin Capacity: 85.0%
Alert: Truck needed in Downtown!
