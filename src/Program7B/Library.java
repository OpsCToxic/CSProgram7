package Program7B;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * Program 7B
 *  This program uses two separate classes called ArrayListLibrary and LinkedListLibrary to calculate the number of operations it takes
 *  to insert a new element into each type of data structure. The number of operations is distinct for each data structure (array list and linked list)
 *  and is used for output to the console. This is achieved by using knowledge of IO operations and reading from a file, as well as creating new classes
 *  that can be used to create objects that can be stored into these types of lists.
 *  4/28/22
 *  @author  Cameron Cobb
 * 
 */
public class Library {
	   
	   public static void fillLibraries(LinkedListLibrary linkedListLibrary, ArrayListLibrary arrayListLibrary) throws IOException {
	      FileInputStream fileByteStream = null; // File input stream
	      Scanner inFS = null;                   // Scanner object
	      int linkedListOperations = 0;
	      int arrayListOperations = 0;
	      
	      BookNode currNode;
	      Book tempBook;
	      
	      String bookTitle;
	      String bookAuthor;
	      long bookISBN;
	      
	      // Try to open file
	      fileByteStream = new FileInputStream("Books.txt");
	      inFS = new Scanner(fileByteStream);

	      while (inFS.hasNextLine()) {
	         bookTitle = inFS.nextLine();
	         bookISBN = inFS.nextLong();
	         inFS.nextLine();
	         bookAuthor = inFS.nextLine();
	         
	         // Insert into linked list
	         currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
	         linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
	         linkedListLibrary.lastNode = currNode;
	         
	         // Insert into ArrayList
	         tempBook = new Book(bookTitle, bookAuthor, bookISBN);
	         arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);
	      }
	      
	      fileByteStream.close(); // close() may throw IOException if fails
	   }
	       
	   public static void main (String[] args) throws IOException {
	      Scanner scnr = new Scanner(System.in);
	      int linkedListOperations = 0;
	      int arrayListOperations = 0;
	      
	      // Create libraries
	      LinkedListLibrary linkedListLibrary = new LinkedListLibrary();
	      ArrayListLibrary arrayListLibrary = new ArrayListLibrary();
	      
	      // Fill libraries with 100 books
	      fillLibraries(linkedListLibrary, arrayListLibrary);
	      
	      // Create new book to insert into libraries
	      BookNode currNode;
	      Book tempBook;
	      
	      String bookTitle;
	      String bookAuthor;
	      long bookISBN;
	      
	      bookTitle = scnr.nextLine();
	      bookISBN = scnr.nextLong();
	      scnr.nextLine();
	      bookAuthor = scnr.nextLine();
	       
	      // Insert into linked list
	      currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
	      
	      // TODO: Call LL_Library's insertSorted() method to insert currNode and return
	      //       the number of operations performed
	      
	      /*
	       * For this part of the main method, I called insertSorted on the LinkedListLibrary class and assigned the result to linkedListOperations which
	       * calculates the number of operations for the given data list.
	       * This inserts a book as a new node rather than as an element of an array, into a linked list. The last node
	       * of the linked list is set to the currNode, or the latest book.
	       */
	      linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
	      linkedListLibrary.lastNode = currNode;
	      
	      // Insert into ArrayList
	      tempBook = new Book(bookTitle, bookAuthor, bookISBN);
	      
	      // TODO: Call AL_Library's insertSorted() method to insert tempBook and return
	      //       the number of operations performed
	      /*
	       * For this part of the main method, assign the result of the insertSortedMethod of the arrayListLibrary object and assign it to arrayListOperations, 
	       * calculating the respective number of operations.
	       */
	       arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);
	     
	       /*
	        * This sections prints both linkedListOperations and arrayListOperations, showing the efficiency of the two types of lists when 
	        * inserting books.
	        */
	       // TODO: Print number of operations for linked list
	       System.out.println("Number of linked list operations: " + linkedListOperations);
	      // TODO: Print number of operations for ArrayList
	      System.out.println("Number of ArrayList operations: " + arrayListOperations);
	   }
	}