import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    // Array
    ArrayList<Book> LibraryCollection = new ArrayList<Book>();


    // when addBook method is called, the arraylist's add method will be called, which will add the book that was added
    // in the client class, to the arraylist
    // Book > Parameter's type (aka the class type)
    // bookInfo > refers to the Book object instantiated in the Client class, that is being used as an argument for
    // this method's parameter
    public void addBook(Book bookInfo){
        LibraryCollection.add(bookInfo);        // the arraylist's add method adds the object to the arraylist
    }

    public void listBook(){
        System.out.printf("%-25s%-25s%-25s%-25s%n", "Title", "Author", "Genre", "Availability");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for(int index = 0; index < LibraryCollection.size(); index++){
            System.out.printf("%-25s%-25s%-25s%-25s%n", LibraryCollection.get(index).getTitle(),
                                                        LibraryCollection.get(index).getAuthor(),
                                                        LibraryCollection.get(index).getGenre(),
                                                        LibraryCollection.get(index).getAvailability());
        }
    }

    public void removeBook(String title){
        for(int index = 0; index < LibraryCollection.size(); index++){
            if(LibraryCollection.get(index).getTitle() == title){
                LibraryCollection.remove(index);
            }
        }
    }
}
