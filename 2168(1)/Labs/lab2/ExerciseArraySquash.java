import java.util.Arrays;

public class ExerciseArraySquash {

   /**
    * squash() takes an array of non-negative ints. On completion the array contains
    * the same numbers, but wherever the array had two or more consecutive duplicate
    * numbers, they are replaced by one copy of the number. Hence, after squash() is
    * done, no two consecutive numbers in the array are the same.
    *
    * Any unused elements at the end of the array are set to -1.
    *
    * For example, if the input array is [ 0 0 0 0 1 1 0 0 0 7 7 7 1 1 0 ], then it
    * reads [ 0 1 0 7 1 0 -1 -1 -1 -1 -1 -1 -1 -1 -1 ] after squash() completes.
    *
    **/

   public static void squash(int[] a) {
      // YOUR SOLUTION GOES HERE

      int[] temp = new int[a.length]; // new temp array to compare elem and increment thru the array
      int j = 0; // global var
      for (int i = 0; i < a.length -1; i++) {
         if (a[i] != a[i + 1]) { // if 1st elem doesn't equal the next elem
            temp[j++] = a[i]; // increment(Update) and keep going
         }
      }
      temp[j++] = a[a.length - 1];

      for (int i = 0; i < a.length; i++) {       // change original array
         if (i < j) {
            a[i] = temp[i]; // the elem in a array will equal the
         } else
            a[i] = -1; // else replace by -1
      }
   }


   /* main() tests your solution - do NOT modify tests you find in main(),
      but feel free to add your own tests.
    */
   public static void main(String[] args) {
      System.out.println("Let's squash arrays!\n");

      String result;
      int i;

      /*------------- START TEST 1 ---------------*/
      int[] test1 = {2, 8, 8, 8, 4, 5, 5, 3, 0, 7, 7, 7, 7, 5};
      System.out.println("Squashing " + Arrays.toString(test1) + ":");
      squash(test1);
      result = Arrays.toString(test1);      // your solution (updated int[] test1) represented as a String
      System.out.println("          " + result + ".");
      verify(result.equals(
            "[2, 8, 4, 5, 3, 0, 7, 5, -1, -1, -1, -1, -1, -1]"),
            "BAD SQUASH!!!  No candy.");
      /*-------------- END TEST 1 ----------------*/

      System.out.println();

      /*------------- START TEST 2 ---------------*/
      int[] test2 = {7, 7, 7, 7, 7, 4, 7, 4, 7, 4, 4, 4, 4, 4, 4};
      System.out.println("Squashing " + Arrays.toString(test2) + ":");
      squash(test2);
      result = Arrays.toString(test2);
      System.out.println("          " + result + ".");
      verify(result.equals(
            "[7, 4, 7, 4, 7, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1]"),
            "BAD SQUASH!!!  No candy.");
      /*-------------- END TEST 2 ----------------*/

      System.out.println();

      /*------------- START TEST 3 ---------------*/
      int[] test3 = {4, 4, 4, 4, 4};
      System.out.println("Squashing " + Arrays.toString(test3) + ":");
      squash(test3);
      result = Arrays.toString(test3);
      System.out.println("          " + result + ".");
      verify(result.equals("[4, -1, -1, -1, -1]"),
            "BAD SQUASH!!!  No candy.");
      /*-------------- END TEST 3 ----------------*/

      System.out.println();

      /*------------- START TEST 4 ---------------*/
      int[] test4 = {0, 1, 2, 3, 4, 5, 6};
      System.out.println("Squashing " + Arrays.toString(test4) + ":");
      squash(test4);
      result = Arrays.toString(test4);
      System.out.println("          " + result + ".");
      verify(result.equals("[0, 1, 2, 3, 4, 5, 6]"),
            "BAD SQUASH!!!  No candy.");
      /*-------------- END TEST 4 ----------------*/
   }

   /* NO NEED TO MODIFY CODE BELOW THIS LINE.

      verify() checks an invariant and prints an error message if it fails.
      If invariant is true, this method does nothing.  If invariant is false,
      an error message is printed.
    */
   static void verify(boolean invariant, String message) {
      if (!invariant) {
         System.out.println("*** ERROR:  " + message);
         // Thread.dumpStack();  // uncomment this if you want to see the stack trace of your errors
      }
   }

}
