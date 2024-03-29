# Library-Management-System-CoreJava-ConsoleBasedApplication

## Introdution to LMS:
Library Management System (LMS) designed to automate various tasks related to managing books in a library. It provides a user-friendly interface for managing library resources efficiently, ensuring accurate record-keeping and easy access to book information. It simplifies administrative tasks and enhances the overall experience of library management.

*Purpose:*  The purpose of the Library Management System is to provide an efficient and organized way to manage the inventory of books in a library. It streamlines processes such as adding new books, removing existing ones, updating book information, and retrieving book details.

*Main Features:*
1)	Menu-driven Interface –
- The system facilitates user interaction through a menu-driven interface, offering a range of options for performing actions such as adding, removing, and updating book details, as well as retrieving book information or exiting the system. 
- Users can navigate through the interface to select their desired actions, enabling efficient management and access to the library's resources
2)	Book Management –
Users add, remove, update book details, and retrieve specific book information, enhancing library functionality through comprehensive management features.
- Adding a Book - Users enrich the library's collection by inputting new book entries, including essential information such as name, author, and price. 
- Removing a Book - Removal of books is facilitated through specifying the book's name. 
- Updating a Book -Existing book records can be modified, allowing updates to details like name, author, and price.
- Get a Book - Users access specific book details by conducting name-based searches.
3)	Data Persistence –
The system utilizes objects of the Book class to manage the library's book inventory. Book details are stored within a Library object, encompassing attributes like name, address, pin code, and a comprehensive list of books.
4)	MVC Architecture –
It ensures a clear separation of concerns: data handling (Model), user interface (View), and business logic (Controller), enhancing scalability, maintainability, and code organization.

## __Architecture Of LMS :__

The MVC (Model-View-Controller) architecture helps to organize and structure the given library management system (LMS) application by separating concerns and promoting modularity. Here's how MVC architecture benefits the application:
1)	Model *(com.jspid.lms.model)* –
- The Book and Library classes represent the model component of the MVC architecture. They encapsulate the data and business logic of the application.
- The Book class defines the attributes and behavior of a book entity, such as its name, author, and price.
- The Library class represents the collection of books in a library and includes methods to manage the books (add, remove, update, retrieve).
2)	View *(com.jspid.lms.view)* –
- The View class serves as the presentation layer of the application. It interacts with the user by displaying information and receiving input through the console.
- The user interface, implemented in the main method of the View class, presents options to the user (add book, remove book, update book, get book) and processes user input accordingly.
3)	Controller *(com.jspid.lms.controller)* –
- The Controller class acts as an intermediary between the model and the view. It receives input from the view, processes it, and updates the model accordingly.
- Methods in the Controller class delegate tasks to the model (e.g., adding, removing, updating, retrieving books) based on user input received from the view.
- The controller isolates the view from direct interaction with the model, promoting loose coupling and easier maintenance.

Data Flow :
![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/1e1ebd3e-3265-4151-a7a4-528b6d71b8c5)
- Data flows from the View to the Controller, where user inputs are processed.
- The Controller interacts with the Model to perform operations on library data (add, remove, update, get book).
- Finally, the updated data is reflected back to the View for display.


Advantages of MVC Architecture:
-	Separation of Concerns: MVC separates the application into distinct components, each responsible for a specific aspect of the functionality. This separation makes the codebase easier to understand, maintain, and test.
-	Modularity: Each component (model, view, controller) can be developed, tested, and modified independently, promoting code reusability and scalability.
-	Flexibility: Changes to one component (e.g., the view) do not necessarily impact the others (e.g., the model or controller), allowing for easier updates and modifications.
-	Enhanced Maintainability: With clear separation of responsibilities, it's easier to locate and fix bugs, add new features, or make enhancements without affecting other parts of the application.

## How to use LMS? 
To use the given Library Management System (LMS) application, follow these steps:
1)	Compile all the Java files (View.java, Controller.java, Library.java, and Book.java) using a Java compiler like javac.
2)	After compilation, execute the View class, which contains the main method.This can be done by running the View class with the java command: 
*java com.jspid.lms.view.View*
3)	Follow the On-Screen Instructions, you'll be prompted with a welcome message and instructions on how to interact with the system.Follow the prompts to perform actions such as adding a book, removing a book, updating book details, getting book details, or exiting the system.
4)	Interact with the System based on the options provided, input the corresponding digit to perform the desired action.
5)	For example,
   - To add a book, enter 1, and then provide the book's details as prompted.
     ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/22496660-9be4-4b16-be15-fdd162534a9b)
   - To remove a book, enter 2, and provide the name of the book to be removed.
     - Note : If you want to make sure the Book is removed than enter 4 -
       ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/4812f479-284f-488d-94b6-70d31f229188)
     - In case, if the Book you want to remove does not Exist in Library –
       ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/78a3c167-9c06-47be-8813-7ee288007310)
   - To update book details, enter 3, and follow the instructions to select the aspect of the book to update and provide the new details.
     ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/5b743cd0-0388-4d89-9cbe-173611a81bba)
     - In case, if the Book you want to update does not Exist in Library -
       ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/273439d9-1795-4d8d-8642-e985b2489ed5)
   - To get details of a book, enter 4, and provide the name of the book to retrieve its details.
     ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/66185b3f-086c-475c-aac3-2e8f69f21972)
   - To exit the system, enter 0.
     ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/dfb38cfc-30d9-4f34-825f-b8f6507a17e4)
   - If  user input invalid choice, than the System prompts “INVALID SELECTION”
      ![image](https://github.com/imszainab/Library-Management-System-CoreJava-ConsoleBasedApplication/assets/60963530/556813bb-55ce-4aaf-bb47-462c6756bd26)




