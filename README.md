# Library-Management-System-CoreJava-ConsoleBasedApplication

Introduction to LMS:
Library Management System (LMS) designed to automate various tasks related to managing books in a library. It provides a user-friendly interface for managing library resources efficiently, ensuring accurate record-keeping and easy access to book information. It simplifies administrative tasks and enhances the overall experience of library management.

Purpose:  The purpose of the Library Management System is to provide an efficient and organized way to manage the inventory of books in a library. It streamlines processes such as adding new books, removing existing ones, updating book information, and retrieving book details.

Main Features: 
1)	Menu-driven Interface –
•	The system facilitates user interaction through a menu-driven interface, offering a range of options for performing actions such as adding, removing, and updating book details, as well as retrieving book information or exiting the system. 
•	Users can navigate through the interface to select their desired actions, enabling efficient management and access to the library's resources
2)	Book Management –
Users add, remove, update book details, and retrieve specific book information, enhancing library functionality through comprehensive management features.
•	Adding a Book - Users enrich the library's collection by inputting new book entries, including essential information such as name, author, and price. 
•	Removing a Book - Removal of books is facilitated through specifying the book's name. 
•	Updating a Book -Existing book records can be modified, allowing updates to details like name, author, and price.
•	Get a Book - Users access specific book details by conducting name-based searches.
3)	Data Persistence –
The system utilizes objects of the Book class to manage the library's book inventory. Book details are stored within a Library object, encompassing attributes like name, address, pin code, and a comprehensive list of books.
4)	MVC Architecture –
It ensures a clear separation of concerns: data handling (Model), user interface (View), and business logic (Controller), enhancing scalability, maintainability, and code organization.

Architecture Of LMS :
The MVC (Model-View-Controller) architecture helps to organize and structure the given library management system (LMS) application by separating concerns and promoting modularity. Here's how MVC architecture benefits the application:
1)	Model (com.jspid.lms.model) –
•	The Book and Library classes represent the model component of the MVC architecture. They encapsulate the data and business logic of the application.
•	The Book class defines the attributes and behavior of a book entity, such as its name, author, and price.
•	The Library class represents the collection of books in a library and includes methods to manage the books (add, remove, update, retrieve).
2)	View (com.jspid.lms.view) –
•	The View class serves as the presentation layer of the application. It interacts with the user by displaying information and receiving input through the console.
•	The user interface, implemented in the main method of the View class, presents options to the user (add book, remove book, update book, get book) and processes user input accordingly.
3)	Controller (com.jspid.lms.controller) –
•	The Controller class acts as an intermediary between the model and the view. It receives input from the view, processes it, and updates the model accordingly.
•	Methods in the Controller class delegate tasks to the model (e.g., adding, removing, updating, retrieving books) based on user input received from the view.
•	The controller isolates the view from direct interaction with the model, promoting loose coupling and easier maintenance.

Advantages of MVC Architecture:
-	Separation of Concerns: MVC separates the application into distinct components, each responsible for a specific aspect of the functionality. This separation makes the codebase easier to understand, maintain, and test.
-	Modularity: Each component (model, view, controller) can be developed, tested, and modified independently, promoting code reusability and scalability.
-	Flexibility: Changes to one component (e.g., the view) do not necessarily impact the others (e.g., the model or controller), allowing for easier updates and modifications.
-	Enhanced Maintainability: With clear separation of responsibilities, it's easier to locate and fix bugs, add new features, or make enhancements without affecting other parts of the application.
