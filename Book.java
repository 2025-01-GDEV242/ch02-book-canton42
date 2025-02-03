/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Nolan Canto
 * @version 2025.02.03
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    
    //returns the author field
    public String getAuthor(){
        return author;
    }
    
    //returns the title field
    public String getTitle(){
        return title;
    }
    
    //prints author field to terminal
    public void printAuthor(){
        System.out.println(author);
    }
    
    //prints title field to terminal
    public void printTitle(){
        System.out.println(title);
    }
    
    
}
