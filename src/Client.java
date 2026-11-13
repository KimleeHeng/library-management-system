// A3: Library Management System
// Create a simple library management system that allows a user to manage a collection of books
// using Java's ArrayList and enums.

//Client Class:
//Implement a Client class with a main method to simulate user interaction:
//Create an instance of the Library.
//Add several Book objects to the library.
//List all books in the library.
//Allow the user to toggle the availability of a book by title.
//List all books again to show the updated availability.

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        // new scanner for user input
        Scanner in = new Scanner(System.in);

        String userInput;

        // new instance of 'Library' being created
        Library newLibrary = new Library();

        // Instantiating new book objects, then the book objects are being added to newLibrary instance via
        // addBook method
        newLibrary.addBook(new Book("The Hunger Games", "Suzanne Collins", Book.Genre.FICTION, true));
        newLibrary.addBook(new Book("Atomic Habits", "James Clear", Book.Genre.NON_FICTION, true));
        newLibrary.addBook(new Book("Cosmos", "Carl Sagan", Book.Genre.SCIENCE, true));
        newLibrary.addBook(new Book("Carthage: A New History", "Eve MacDonald", Book.Genre.HISTORY, true));
        newLibrary.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", Book.Genre.FANTASY, true));
        newLibrary.addBook(new Book("Washington: A Life", "Ron Chernow", Book.Genre.BIOGRAPHY, true));

        // listBook method called within newLibrary to display all books within the library management system
        newLibrary.listBook();

        // removing the first book via the removeBook method, then displaying the remaining books with the changes made
        System.out.println("\nRemoving 'The Hunger Games' from system...\n");
        newLibrary.removeBook("The Hunger Games");
        newLibrary.listBook();

        System.out.print("\nWould you like to toggle the availability of a book? Enter YES or NO: ");
        userInput = in.nextLine();

        // Input validation ensuring either 'yes' or 'no' is inputted
        while(!userInput.equalsIgnoreCase("YES") && !userInput.equalsIgnoreCase("NO")){
            System.out.print("Invalid Answer. Please enter Yes or No: ");
            userInput = in.nextLine();
        }

        // If userInput equals Yes, the following code will execute
        if(userInput.equalsIgnoreCase("YES")){
            // User's input assigned to variable userInput
            System.out.print("Type the book that you want to toggle the availability of: ");
            userInput = in.nextLine();

            // input validation for book title
            for(int counter = 0; counter < newLibrary.LibraryCollection.size(); counter++){
                if(!newLibrary.LibraryCollection.get(counter).getTitle().equalsIgnoreCase(userInput)){
                    System.out.print("Title does not match any book in system. Please try again: ");
                    userInput = in.nextLine();
                }
            }
            // for loop goes through newLibrary's arraylist. Compares the value within the current index with the
            // value within userInput. If the values match, then the toggleAvailability method will be called,
            // changing the boolean value from true to false, or 'On Shelf' to 'Checked Out'
            for(int index = 0; index < newLibrary.LibraryCollection.size(); index++){
                if(newLibrary.LibraryCollection.get(index).getTitle().equalsIgnoreCase(userInput)){
                    newLibrary.LibraryCollection.get(index).toggleAvailability();
                }
            }
        }



        newLibrary.listBook();
    }
}
