Day 005 Pogram - Passenger_Verification _System

Scenario : DigiYatra – Passenger Verification System

Objective :- Automate passenger verification at the airport using identity and flight details.

Question :- Design a Passenger class for the DigiYatra app.

Use a parameterized constructor to initialize :- passengerId (String) fullName (String) passportNumber (String) flightNumber (String)

Create a method verifyIdentity() to: Check that none of the fields are empty. (Hint: Use predefined method of String:- isEmpty() e.g: fullName.isEmpty()) Validate passportNumber must be 8 alphanumeric characters.

Overload verifyIdentity(): Version 1: No parameters (checks all fields) Version 2: Takes passportNumber only and validates format.

Validations: passportNumber must match [A-Z0-9]{8} (Hint: Use predefined method:- passportNumber.matches("[A-Z0-9]{8}")

All fields must be non-null and non-empty

| Sample input :- 
| Passport Number: AB1234XY | | Passport Verification: Valid
| Sample Output :- 
| Passenger ID: DY2034 
| Verification Status: Success |
|_______________________________|

Sample Input :- DY2034 ArjunKumar AB1234XY AI101

Sample Output :- Verification Status: Success Passport Verification: Valid


