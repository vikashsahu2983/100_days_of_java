Day 045 – Campus Placement Eligibility Checker
____________________________________________________
<img width="358" height="698" alt="image" src="https://github.com/user-attachments/assets/4014457e-9922-4b47-ae3c-482097df4765" />

____________________________________________________


You need to create a Java program that checks whether a student is eligible for campus placement based on academic performance, skills, and company requirements. The program should take the student’s details as input, apply the eligibility rules, and display a clear result indicating whether the student qualifies for placement opportunities.

User Input Requirements

Student Name

Branch

Current CGPA

Number of Active Backlogs

Total Number of Technical Skills

Skills List (enter each skill name)

Company Criteria

Minimum CGPA

Maximum allowed backlogs

Required Skills Count

Eligibility Rules

Student’s CGPA must be equal to or higher than the company’s minimum CGPA.

Backlogs must be less than or equal to the company’s allowed limit.

Student must have at least the required number of skills.

Program Output

Your program should display:

Student Details

Company Criteria

Eligibility Status:

“Eligible for Placement” if all criteria match

“Not Eligible” if any one condition fails

A short message:

If eligible → “You can apply for this company.”

If not eligible → “Please work on improving your profile.”

Sample Input 1

Student Name: Rohan Mehta
Branch: CSE
CGPA: 8.2
Backlogs: 0
Skills Count: 4
Skills: Java, SQL, Python, HTML
Company Min CGPA: 7.0
Allowed Backlogs: 1
Required Skills: 3

Sample Output 1

Placement Eligibility Report
Student: Rohan Mehta
Branch: CSE
CGPA: 8.2
Backlogs: 0
Skills: Java, SQL, Python, HTML
Status: Eligible for Placement
Message: You can apply for this company.

Sample Input 2

Student Name: Neha Sharma
Branch: ECE
CGPA: 6.5
Backlogs: 2
Skills Count: 2
Skills: C Programming, MATLAB
Company Min CGPA: 7.0
Allowed Backlogs: 1
Required Skills: 3

Sample Output 2

Placement Eligibility Report
Student: Neha Sharma
Branch: ECE
CGPA: 6.5
Backlogs: 2
Skills: C Programming, MATLAB
Status: Not Eligible
Message: Please work on improving your profile.
