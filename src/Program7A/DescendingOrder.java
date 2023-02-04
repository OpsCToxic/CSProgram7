package Program7A;
/**
 * Program 7A
 *  This program creates a selection sort algorithm that sorts an int array list in descending order, wth the largest element first and the smallest 
 *  element last. This is accomplished through an iterative solution by using multiple nested for loops to iterate and find the largest element of 
 *  the unsorted portion of the array.
 *  4/28/22
 *  @author  Cameron Cobb
 * 
 */
import java.util.Scanner;

public class DescendingOrder {
//    TODO: Write a void method selectionSortDescendTrace() that takes 
//          an integer array and the number of elements in the array as arguments, 
//          and sorts the array into descending order.
   
/**
 * This method creates a descending selection sort by iterating through an array list and finding the minimum value of each unsorted part of the
 * array. Nested for loops are used and a variable maxElement to store the largest element and swap the largest element with the current element in the
 * list. Then the list is printed.
 * @param numbers
 * @param numElements
 */
public static void selectionSortDescendTrace(int [] numbers, int numElements) {
	   int maxElement;
	   int maxIndex;
	   for (int i = 0; i < numbers.length - 1; ++i) {
		   maxElement = numbers[i];
		   maxIndex = i;
		   //Find max element from i to numbers length
		   for (int j = i + 1; j < numbers.length; ++j) {
			   if (numbers[j] > maxElement) {
				   maxElement = numbers[j];
				   maxIndex = j;
			   }
		   }
		   
		   //Swap index of max element and i
		   int temp = numbers[i];
		   numbers[i] = maxElement;
		   numbers[maxIndex] = temp;
		   
		   for (int k = 0; k < numbers.length; ++k) {
			   System.out.print(numbers[k] + " ");
		   }
		   System.out.println();
	   }
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];
     
      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      
      
      /*
       * This part of the main method reads in integers from the scanner, accepting no more than 10. If -1 is entered, the while loop
       * stops. After each entered number, the numElements variable is incremented, as well as the loop variable i. The selectionSortDescendTrace() method
       * is called with the user entered array and the number of elements as parameters.
       */
      while (i < numbers.length) {
    	  numbers[i] = scnr.nextInt();
    	  if (numbers[i] == -1) {
    		  break;
    	  }
    	  numElements++;
    	  i++;
      }
      
      int [] newNumbers = new int[numElements];
      
      for (int k = 0; k < numElements; ++k) {
		   newNumbers[k] = numbers[k];
	   }
      
    
	   selectionSortDescendTrace(newNumbers, numElements);

   }
}


