class Library{
    String[] books;// = {"book1", "book2", "book3"}; // this is a field
    int no_of_books;// = 0; // this is a field
    Library(){ // this is a constructor
        this.books = new String[100]; //we create an array of 100 books in the constructor and assign it to the field books
        this.no_of_books = 0;// we assign 0 to the field no_of_books
    }

    void addBook(String book){ // this is a method that adds a book to the library
        this.books[no_of_books] = book;//this book will store in the array books at the index no_of_books which is 0
        no_of_books++;// we increment the number of books in the library by 1
        System.out.println(book+ " has been added!");// we print a message to the user that the book has been added
    }


    // this is a method that prints all the books in the library to the user
    void showAvailableBooks(){ // this is a method that shows all the books in the library
        System.out.println("Available Books are:");// we print a message to the user that the books are available
        for (String book : this.books) {// we loop through the array of books in the library and print each book
            if (book == null){// we check if the book is null and if it is we break out of the loop
                continue;// we continue to the next iteration of the loop
            }
            System.out.println("* " + book);// we print the book to the user
        }
    }
    // this is a method that issues a book to a user from the library and prints a message to the user
    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){// we loop through the array of books in the library
            if (this.books[i].equals(book)){// we check if the book is in the library and if it is we remove it from the library
                System.out.println("The book has been issued!");
                this.books[i] = null;// we set the book to null in the array of books in the library
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){// this is a method that returns a book to the library and prints a message to the user
        addBook(book);
    }

}
public class CodeXam {// this is the main class
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Harry Potter");
        centralLibrary.addBook("Data Structures and Algorithms in Java Second Edition");
        centralLibrary.addBook("The Alchemist");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Harry Potter");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Rich Dad Poor Dad");
        centralLibrary.showAvailableBooks();
    }
}