//Book Class:
//Define a class named Book with the following attributes:
//String title
//String author
//Genre genre
//boolean isAvailable
//Include a constructor to initialize these attributes.
//Provide getters and setters for each attribute.
//Implement a method toggleAvailability() that changes the availability status of the book.

public class Book {

    String title;
    String author;
    Genre genre;        // Genre is the class, bookGenre is the object of the class?
    boolean isAvailable;


    // Constructor that is automatically run when a new 'Book' is made
    public Book(String title, String author, Genre genre, boolean avail){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = avail;
    }

    // Getter method for TITLE attribute
    public String getTitle(){
        return title;
    }
    // Setter method for TITLE attribute
    public void setTitle(String title){
        this.title = title;
    }

    // Getter method for AUTHOR attribute
    public String getAuthor(){
        return author;
    }
    // Setter method for AUTHOR attribute
    public void setAuthor(String author){
        this.author = author;
    }

    // Getter method for GENRE attribute
    public String getGenre(){
        return genre.toString();
    }
    // Setter method for GENRE attribute
    public void setGenre(Genre bookGenre){
        this.genre = bookGenre;
    }

    // Getter method for AVAILABILITY attribute
    public String getAvailability(){
        String status;
        if(isAvailable)
            status = "On Shelf";
        else
            status = "Checked Out";
        return status;
    }
    // Setter method for AVAILABILITY attribute
    public void setAvailability(boolean avail){
        this.isAvailable = avail;
    }

    public void toggleAvailability(){
        isAvailable = !isAvailable;
    }

    public enum Genre{FICTION, NON_FICTION, SCIENCE, HISTORY, FANTASY, BIOGRAPHY, UNKNOWN}
}