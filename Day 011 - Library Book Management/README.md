Day 011 -- Library_Book_Management
____________________________________________________
You are building a system for a library. Each book has a title, an author, and a unique ISBN.
Write a program to create a class Book with a constructor to initialize these values.
Add a method display() to print the book details.
Class Name:
Book
Instance Variables:
- title (String)
- author (String)
- isbn (String)
Constructor:
- Book(String title, String author, String isbn) → initializes the instance variables.
Method:
- display() → prints the book details.
Main Class:
- LibraryMain → contains the main method.
- In the main method, instantiate Book objects and invoke the display() method.
Input Format:
First word: Book title (String)
Second word: Author name (String)
Third word: ISBN (String)
Output Format:
Title: <title>, Author: <author>, ISBN: <isbn>
Note:
Use Scanner with next() method for reading string inputs.
Sample Input
JavaBasics
Alice
ISBN001
Sample Output
Title: JavaBasics, Author: Alice, ISBN: ISBN001
Constraints:
Title, author, and ISBN must not
be empty.
