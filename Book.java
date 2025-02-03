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
    private String refNumber;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    
    //85 - modify object add a new private field with appropriate accessors
    //88 - modify object add a new private field with appropriate accessors
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";

    }

    // Add the methods here ...
    
    //88 - modify object add a new private field with appropriate accessors
    public void setRefNumber(String ref){
        refNumber = ref;
    }
    
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
    
    //88 - modify object add a new private field with appropriate accessors
    public String getRefNumber(){
        return refNumber;
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
        System.out.println("# Title: " + title);
        System.out.println("# Author: " + author);
        System.out.println("# Pages: " + pages);
        System.out.println("############");
    }
}
