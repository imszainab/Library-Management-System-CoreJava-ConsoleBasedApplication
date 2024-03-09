package com.jspid.lms.model;

/**
 * The Book class represents a book entity in the Library Management System.
 * It contains information about the book's name, author, and price.
 */
public class Book {
	
    private String bookName; // The name of the book.
    private String bookAuthor; // The author of the book.
    private double bookPrice; // The price of the book.
	
    /**
     * Retrieves the name of the book.
     * @return The name of the book.
     */
    public String getBookName() {
        return bookName;
    }
	
    /**
     * Sets the name of the book.
     * @param bookName The name of the book to be set.
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
	
    /**
     * Retrieves the author of the book.
     * @return The author of the book.
     */
    public String getBookAuthor() {
        return bookAuthor;
    }
	
    /**
     * Sets the author of the book.
     * @param bookAuthor The author of the book to be set.
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
	
    /**
     * Retrieves the price of the book.
     * @return The price of the book.
     */
    public double getBookPrice() {
        return bookPrice;
    }
	
    /**
     * Sets the price of the book.
     * @param bookPrice The price of the book to be set.
     */
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
	
    /**
     * Returns a string representation of the book.
     * @return A string containing the book's name, author, and price.
     */
    @Override
    public String toString() {
        return "Book name = " + bookName + "\nBook author = " + bookAuthor + "\nBook price = " + bookPrice;
    }
}
