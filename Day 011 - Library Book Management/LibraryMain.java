// here import the scanner in thr program
import java.util.Scanner;

// BLC - Business Logic class
class LibraryMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        String isbn=sc.nextLine();
        Book b1=new Book(title,author,isbn);
        System.out.println(b1.display());
    }
}


//ELC - execution logic class
class Book{
    String title;
    String author;
    String isbn;
  
    
    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        
    }
    
    //here method to display the book detail
    //sample -- Title: Algorithms, Author: Charles, ISBN: ISBN12345
    public String display(){
        return "Title: "+title+", Author: "+author+", ISBN: "+isbn;
    } 
}



// Expected Output:
// Title: Algorithms, Author: Charles, ISBN: ISBN12345
