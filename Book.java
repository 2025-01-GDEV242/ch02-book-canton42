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
    private int pages;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    
    //85 - modify object add a new private field with appropriate accessors
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;

    }

    // Add the methods here ...
    
    //83 - create accessors for String fields
    public String getAuthor(){
        return author;
    }
    
    //83 - create accessors for String fields
    public String getTitle(){
        return title;
    }
    
    //85 - modify object add a new private field with appropriate accessors
    public int getPages(){
        return pages;
    }
    
    //84 - create print utility methods for private fields
    public void printAuthor(){
        System.out.println(author);
    }
    
    //84 - create print utility methods for private fields
    public void printTitle(){
        System.out.println(title);
    }
    
    //87 - add a printDetails method that displays formatted output for all private fields
    public void printDetails(){
        System.out.println("############");
        System.out.println("# Title: " + getTitle());
        System.out.println("# Author: " + getAuthor());
        System.out.println("# Pages: " + getPages());
        System.out.println("############");
    }
}
