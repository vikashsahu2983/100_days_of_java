Day 2 Question: Design a Java program to simulate a simple version of LinkedIn Profile Management.
____________________________________________________________________________________________________
You need to create the following classes:

Address class:-
Instance variables: String streetName String state String country Method: void contactInfo() (empty method for future use).

Profile class:-
Instance variables: String name String designation Address address (has-a relationship with Address) String webPage int connections (starts from 0) String universityName

LinkedIn class :-
Static Scanner sc for user input. Methods: static void createProfile(Profile p, Address a) Takes a Profile and Address object as parameters. Reads details from the user (name, designation, address details, webpage, university). Assigns them to the Profile object. static void follow(Profile p1, Profile p2) Prints: <p1.name> following <p2.name> Increases p2.connections by 1. void connect(Profile p1, Profile p2) Prints: "Request sent for connection." static String viewProfile(Profile p) Returns profile details in a formatted string.

User class (Driver class) :-
main() method should: Create two profiles with addresses. Call createProfile() for both profiles. Print one profile details using viewProfile(). Demonstrate follow and connect features.

Sample Input ----------
Enter your name: Vikash
Enter designation: Software Engineer
Enter street name: MG Road
Enter state: Madhya Pradesh
Enter country: India
Enter webpage link: www.vikashprofile.com
Enter the university name: VITS

Enter your name: Raj
Enter designation: Data Analyst
Enter street name: JP Nagar
Enter state: Karnataka
Enter country: India
Enter webpage link: www.rajprofile.com
Enter the university name: Christ University

Sample Output ----------
Name: Vikash Designation: Software Engineer Webpage: www.vikashprofile.com StreetName: MG Road State: Madhya Pradesh Country: India Connections: 0 University Name: VITS

Vikash following Raj Request sent for connection.
