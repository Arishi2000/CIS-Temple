import java.util.Arrays;

public class Exercise2 {
   // twoSum() returns the two distinct elements of the integer array a
   // whose sum is equal to the integer target.
   // twoSum() assumes that a contains exactly one pair of such elements.
   static int[] twoSum (int[] a, int target) {
      int[] result = new int[2];
      // Your code below

      for(int i=0;i<a.length;i++) // outer loop
      {
         for(int j=0;j<a.length;j++) // inner loop
         {
            // check whther elements are distinct or not and whether there sum is equal to the integer target or not
            if(a[i]!=a[j] && a[i]+a[j]==target)
            {
               result[0] = a[i]; // if true then add i and j values to result[]
               result[1] = a[j];

               // return the result because twoSum() expecting that a contains exactly one pair of such elements.
               return result;
            }
         }
      }
      return new int[0]; // return empty[] if no match was found
   }

   public static void main(String[] args) {
      int[] a, result;
      /*------------- START TEST 1 ---------------*/
      a = new int[]{2,11,7,50};
      result = twoSum(a, 9);
      System.out.println(Arrays.toString(result));  // should print [2, 7]

      System.out.println();
      /*------------- START TEST 2 ---------------*/
      a = new int[]{2, 1, 6, 8};
      result = twoSum(a, 10);
      System.out.println(Arrays.toString(result));  // should print [2, 3]     ??????????????????? how 2,3

      System.out.println();
      /*------------- START TEST 3 ---------------*/
      a = new int[]{21, -301, -12, -4, -65, 47, -56, -210, -356, 9, 0, -3, 1024};
      result = twoSum(a, -163);
      System.out.println(Arrays.toString(result));  // should print [47, -210]

      System.out.println();
      /*------------- START TEST 4 ---------------*/
      a = new int[]{21, 68};
      result = twoSum(a, 68);
      System.out.println(Arrays.toString(result));  // should print [] (an empty array)

      System.out.println();
      /*------------- START TEST 5 ---------------*/
      a = new int[]{21};
      result = twoSum(a, 21);
      System.out.println(Arrays.toString(result));  // should print [] (an empty array)

      System.out.println();
      /*------------- START TEST 6 ---------------*/
      a = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
      result = twoSum(a, 15);
      System.out.println(Arrays.toString(result));  // should print [] (an empty array)
   }
}
