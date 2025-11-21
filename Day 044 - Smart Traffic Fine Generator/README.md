Day 044 – Smart Traffic Fine Generator   (Vehicle number, violation type, auto-calculated fine)
_______________________________________________________________________
<img width="449" height="653" alt="image" src="https://github.com/user-attachments/assets/79c95814-7e91-41a2-b416-b81647498de5" />

_______________________________________________________________________
You need to develop a Java program that simulates an automated traffic fine system. The program should take the vehicle details and violation type as input, calculate the fine based on predefined rules, and generate a final receipt displaying all information clearly.

User Input Requirements

Vehicle Number

Vehicle Type (Bike, Car, Auto, Truck)

Violation Type

No Helmet

No Seatbelt

Signal Jump

Over Speed

Wrong Parking

No License

Violation Date and Time

Fine Rules

No Helmet → 1000

No Seatbelt → 1000

Signal Jump → 2000

Over Speed

Bike → 1000

Car → 1500

Heavy Vehicle → 2000

Wrong Parking → 500

No License → 5000

Program Output

Your program must display:

Vehicle Number

Vehicle Type

Violation Type

Violation Date and Time

Calculated Fine

Officer Message

Fine below 2000 → “Please drive safely.”

Fine between 2000 and 4000 → “This is a serious violation.”

Fine above 4000 → “Immediate attention required.”

Sample Input

Vehicle Number: TS09AB1234
Vehicle Type: Car
Violation: Signal Jump
Date & Time: 21-11-2025 04:30 PM

Sample Output

Smart Traffic Fine Receipt
Vehicle: TS09AB1234
Type: Car
Violation: Signal Jump
Date & Time: 21-11-2025 04:30 PM
Total Fine: 2000
Message: This is a serious violation
