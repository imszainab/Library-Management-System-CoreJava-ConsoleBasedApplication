package com.jspid.lms.view;

import java.util.Scanner;

import com.jspid.lms.controller.Controller;
import com.jspid.lms.model.Book;
import com.jspid.lms.model.Library;


/**
 * The View class provides a user interface for interacting with the Library Management System.
 * It allows users to perform various operations such as adding, removing, updating, and retrieving books.
 */
public class View {
    private static Library library = new Library(); // Represents the library instance.

    /**
     * Retrieves the library instance.
     * @return The library instance.
     */
    public static Library getLibrary() {
        return library;
    }

    /**
     * Sets the library instance.
     * @param library The library instance to set.
     */
    public static void setLibrary(Library library) {
        View.library = library;
    }

    private static Scanner myInput = new Scanner(System.in); // Scanner object for user input.
    private static Controller controller = new Controller(); // Controller object for book management.

    static {
        // Initializes the library with user-provided information.
        System.out.println("-------| Welcome to Library Management System |------");
        System.out.print("Enter Library Name : ");
        String libraryName = myInput.nextLine(); 
        library.setLibraryName(libraryName);
        System.out.print("Enter Library Address : ");
        library.setLibraryAddress(myInput.nextLine()); 
        System.out.print("Enter Pincode : ");
        library.setPincode(myInput.nextInt()); 
        myInput.nextLine();
       System.out.println("Have a Good Day Ahead! Thanks for Visiting "+libraryName+".\n");

    }

    /**
     * Main method to run the Library Management System.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        do {
            // Displays the menu for user selection.
            System.out.println("Select Option To Perform : ");
            System.out.println("1. Add book\n2. Remove book\n3. Update book\n4. Get book\n0. Exit");
            System.out.print("Enter Digit Respective to Desired Option : ");
            byte userChoice = myInput.nextByte();
            myInput.nextLine();
            switch (userChoice) {
                // Handles the case when the user chooses to exit.
                case 0:
                    myInput.close();
                    System.out.println("--------- E X I T E D ---------\n");
                    System.exit(0);
                    break;
                // Handles the case when the user chooses to add a book.
                case 1:
                    // Creates a new book instance and adds it to the library.
                    Book book = new Book();
                    System.out.print("Enter Book Name :");
                    book.setBookName(myInput.nextLine());
                    System.out.print("Enter Book Author:");
                    book.setBookAuthor(myInput.nextLine());
                    System.out.print("Enter Book Price :");
                    book.setBookPrice(myInput.nextDouble());
                    myInput.nextLine();
                    controller.addBook(book);
                    System.out.println("-------| Book Added Successfully! |-------\n");
                    break;
                // Handles the case when the user chooses to remove a book.
                case 2:
                    // Removes the specified book from the library.
                    System.out.print("Enter Book Name To Be Removed : ");
                    String bookToRemove = myInput.nextLine();
                    if (controller.removeBook(bookToRemove)) {
                        System.out.println("----| Requested Book Has Been Removed! |----\n");
                    } else {
                        System.out.println("Book Does Not Exist, Cannot Be Removed!\n");
                    }
                    break;
                // Handles the case when the user chooses to update a book.
                case 3:
                    // Updates the details of the specified book.
                    System.out.print("Enter Book Name To Update : ");
                    Book bookExist = controller.getBook(myInput.nextLine());
                    if (bookExist != null) {
                        Book bookToUpdate = bookExist;
                        System.out.println("What To Update??");
                        System.out.println("1.Book name\n2.Author name\n3.Book Price");
                        System.out.print("Enter digit respective to desired option : ");
                        byte userInput = myInput.nextByte();
                        myInput.nextLine();
                        switch (userInput) {
                            case 1:
                                System.out.print("Enter Book Name to Update : ");
                                bookToUpdate.setBookName(myInput.nextLine());
                                break;
                            case 2:
                                System.out.print("Enter Book Author  to Update : ");
                                bookToUpdate.setBookAuthor(myInput.nextLine());
                                break;
                            case 3:
                                System.out.print("Enter Book Price to Update : ");
                                double newbookPrice = myInput.nextDouble();
                                myInput.nextLine();
                                bookToUpdate.setBookPrice(newbookPrice);
                                break;
                            default:
                                System.out.println("Invalid Selection");
                                break;
                        }
                        if (controller.update(bookExist, bookToUpdate)) {
                            System.out.println("-------| Book Updated Successfully! |-------\n");
                        } else {
                            System.out.println("Book Updation Failed!\n");
                        }
                    } else {
                        System.out.println("Book does not Exist.\n");
                    }
                    break;
                // Handles the case when the user chooses to retrieve a book.
                case 4:
                    // Retrieves the details of the specified book.
                    System.out.print("Enter Book Name You Are Looking For : ");
                    Book fetchedBook = controller.getBook(myInput.nextLine());
                    if (fetchedBook != null) {
                        System.out.println("-------| Book Is Available! |-------");
                        System.out.println("Details :");
                        System.out.println(fetchedBook + "\n");
                    } else {
                        System.out.println("Book Is not Available!\n");
                    }
                    break;
                // Handles the case when the user selects an invalid option.
                default:
                    System.out.println("Invalid Selection\n");
                    break;
            }
        } while (true);
    }
}
