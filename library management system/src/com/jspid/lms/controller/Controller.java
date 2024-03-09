package com.jspid.lms.controller;

import java.util.ArrayList;
import java.util.List;
import com.jspid.lms.model.Book;
import com.jspid.lms.model.Library;
import com.jspid.lms.view.View;

/**
 * The Controller class manages the operations related to books in the Library Management System.
 * It provides methods for adding, removing, updating, and retrieving books from the library.
 */
public class Controller {
    private Library library = View.getLibrary(); // Represents the library instance.

    /**
     * Adds a new book to the library.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        List<Book> books = library.getBooks();
        if (books == null) {
            books = new ArrayList<>();
        }
        books.add(book);
        library.setBooks(books);
    }

    /**
     * Removes a book from the library based on its name.
     * @param bookName The name of the book to be removed.
     * @return True if the book was successfully removed, false otherwise.
     */
    public boolean removeBook(String bookName) {
        Book book = getBook(bookName);
        if (book != null) {
            List<Book> books = library.getBooks(); 
            boolean bookRemove = books.remove(book); 
            library.setBooks(books); 
            return true; 
        }
        return false; 
    }

    /**
     * Updates the details of a book in the library.
     * @param bookExist The existing book to be updated.
     * @param bookUpdate The updated book details.
     * @return True if the book was successfully updated, false otherwise.
     */
    public boolean update(Book bookExist, Book bookUpdate) {
        List<Book> books = library.getBooks();
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookExist.getBookName())) {
                books.remove(bookExist);
                books.add(bookUpdate);
                library.setBooks(books);
                return true;
            }
        }
        return false;
    }

    /**
     * Retrieves a book from the library based on its name.
     * @param bookName The name of the book to retrieve.
     * @return The Book object if found, null otherwise.
     */
    public Book getBook(String bookName) {
        List<Book> books = library.getBooks();
        if (books != null) { 
            for (Book book : books) {
                if (book.getBookName().equalsIgnoreCase(bookName)) {
                    return book;
                }
            }
        }
        return null;
    }
}

