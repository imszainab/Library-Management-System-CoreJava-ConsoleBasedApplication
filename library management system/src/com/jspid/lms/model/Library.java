package com.jspid.lms.model;

import java.util.List;

/**
 * The Library class represents a library entity in the Library Management System.
 * It contains information about the library name, address, pincode, and a list of books.
 */
public class Library {

    private String libraryName; // The name of the library.
    private String libraryAddress; // The address of the library.
    private int pincode; // The pincode of the library location.
    private List<Book> books; // The list of books available in the library.

    /**
     * Retrieves the name of the library.
     * @return The name of the library.
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the name of the library.
     * @param libraryName The name of the library to be set.
     */
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    /**
     * Retrieves the address of the library.
     * @return The address of the library.
     */
    public String getLibraryAddress() {
        return libraryAddress;
    }

    /**
     * Sets the address of the library.
     * @param libraryAddress The address of the library to be set.
     */
    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    /**
     * Retrieves the pincode of the library.
     * @return The pincode of the library.
     */
    public int getPincode() {
        return pincode;
    }

    /**
     * Sets the pincode of the library.
     * @param pincode The pincode of the library to be set.
     */
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    /**
     * Retrieves the list of books available in the library.
     * @return The list of books in the library.
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Sets the list of books available in the library.
     * @param books The list of books to be set for the library.
     */
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}


