import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
   public static int count(int[] a) {
      List<ArrayList<Integer>> list = new ArrayList<>();
      // if the array length is less than three so we can't get any triplet
      if(a.length < 3){
         return 0;
      }
      //sorting the array from the hint from the lab instruction
      Arrays.sort(a);
      for(int i = 0;i < a.length - 2;i++){
         //if i more that zero and i and i-1 are equal to each other continue
         if(i > 0 && a[i] == a[i-1]){
            continue;  // ignoring the duplicates
         }
         //now start looking for triplets
         int sum = a[i];
         int front = i+1;
         int end = a.length -1;

         //looking for a pair which sums to SUM
         while(front < end){
            if(end < a.length -1 && a[end] == a[end+1]){
               end--;
               continue; //ignoring duplicates
            }
            if(front>i+1 && a[front] == a[front-1]){
               front++;
               continue; //ignoring duplicates
            }
            if(a[front] + a[end] == -sum){ //found match and add the three values to the list
               ArrayList<Integer> triplet = new ArrayList<>();
               triplet.add(sum);
               triplet.add(a[front]);
               triplet.add(a[end]);
               list.add(triplet);
               front++;
               end--;
            }else if(a[front] + a[end] > -sum){
               end--; //decreasing higher boundary
            }else{
               front++; // increasing lower boundary
            }
         }
      }
      return list.size(); //returning the size of the list
   }

   public static void main(String[] args) {
      In in = new In("16Kints.txt");
      int[] a = in.readAllInts();

      System.out.println("The original array of ints: " + Arrays.toString(a));

      long startTime = System.currentTimeMillis();
      System.out.println("Count is: " + ThreeSum.count(a));
      long endTime = System.currentTimeMillis();
      long timeElapsed = endTime - startTime;
      System.out.println("Execution time in milliseconds  : " + timeElapsed);
   }
}
