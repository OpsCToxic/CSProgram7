package Program7D;
/**
 * Program 7D
 *  This program creates uses an array and a HashSet to determine the uniqueness of a random number. If the number is unique then it is added to
 *  both the array list and HashSet. The program uses a while loop and an i variable to iterate through nums. If the number 
 *  is not unique from HashSet using .contains(nextRand), then the static retries variable is incremented. Every loop iteration generates a random number.
 *  4/28/22
 *  @author  Cameron Cobb
 * 
 */
import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;

public class LabProgram {

   // Print the numbers in array separated by a space
   public static void printNums(int[] nums) {
      for (int i = 0; i < nums.length; ++i) {
         System.out.printf("%d ", nums[i]);
      }
   }

   // Used in uniqueRandomInt(), printed in main()
   public static int retries;

   // Generate howMany unique random ints from 0 to maxNum using randGen
   public static int[] uniqueRandomInts(int howMany, int maxNum) {
      int i = 0;
      int nextRand;
      retries = 0;                                  // Initialize static variable
      Random randGen = new Random(29);              // Random number generator with seed 29

      int[] nums = new int[howMany];
      HashSet<Integer> alreadySeen = new HashSet<Integer>();

      /* Type your code here. */
      
      /*
       * For this part of the uniqueRandomInts method, I decided to use a while loop and assign a random integer everytime the loop
       * iterated once. If the random number had not been seen in the HashSet using alreadySeen's .contains() method, then 
       * the number would be added to the HashSet and the array list, and the loop variable i would be incremented. Else, retries would be incremented and a new random
       * int would be created.
       */
     
      while (i < nums.length) {
    	  nextRand = randGen.nextInt(maxNum);
    	  if (!alreadySeen.contains(nextRand)) {
    		  nums[i] = nextRand;
    		  alreadySeen.add(nextRand);
    		 
    		  i++;
    		 
    	  }
    	  else {
    		  retries++;
    	  }
    	 
      }
    		  

      return nums;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int howMany = scnr.nextInt();
      int maxNum = scnr.nextInt();
 
      int[] uniqueInts = uniqueRandomInts(howMany, maxNum);
      printNums(uniqueInts);
      System.out.printf("  [%d retries]\n", retries); // Print static variable here
   }
}
