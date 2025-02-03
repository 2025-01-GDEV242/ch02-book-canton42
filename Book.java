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
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;

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
    
    //returns the pages field
    public int getPages(){
        return pages;
    }
    
    //prints author field to terminal
    public void printAuthor(){
        System.out.println(author);
    }
    
    //prints title field to terminal
    public void printTitle(){
        System.out.println(title);
    }
    
    public void printDetails(){
        System.out.println("############");
        System.out.println("# Title: " + getTitle());
        System.out.println("# Author: " + getAuthor());
        System.out.println("# Pages: " + getPages());
        System.out.println("############");
    }
}
