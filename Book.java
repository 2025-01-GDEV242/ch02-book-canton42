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
    
    //85 - modify object add a new private field with appropriate accessors
    //88 - modify object add a new private field with appropriate accessors
    //91 - modify object add a new private field with appropriate accessors, mutators and reporting
    //92 - modify object add a new private field with appropriate accessors, mutators and reporting
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    
    //85 - modify object add a new private field with appropriate accessors
    //88 - modify object add a new private field with appropriate accessors
    //91 - modify object add a new private field with appropriate accessors, mutators and reporting
    //92 - modify object add a new private field with appropriate accessors, mutators and reporting
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;

    }

    // Add the methods here ...
    
    //91 - modify object add a new private field with appropriate accessors, mutators and reporting
    public void borrow() {
        borrowed++;
    }
    
    //92 - modify object add a new private field with appropriate accessors, mutators and reporting
    public boolean isCourseText() {
        return courseText;
    }
    //88 - modify object add a new private field with appropriate accessors
    //90 - modify object add a new private field with appropriate accessors, mutators and reporting
    public void setRefNumber(String ref){
        if (ref.length() < 3) {
            System.out.println("Error: illegal reference number.");
        } else {
            refNumber = ref;
        }
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
    
    //91 - modify object add a new private field with appropriate accessors, mutators and reporting
    public int getBorrowed(){
        return borrowed;
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
    //89 - modify printDetails to add new content
    //91 - modify object add a new private field with appropriate accessors, mutators and reporting
    public void printDetails(){
        System.out.println("############");
        System.out.println("# Title: " + title);
        System.out.println("# Author: " + author);
        System.out.println("# Pages: " + pages);
        System.out.println("# Borrowed: " + borrowed + " times");
        
        if (refNumber.length() == 0){
            System.out.println("# Reference Number: ZZZ");
        } else {
            System.out.println("# Reference Number: " + refNumber);
        }
        
        System.out.println("############");
    }
}
