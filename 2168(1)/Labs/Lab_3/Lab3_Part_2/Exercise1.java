import java.util.List;

import java.util.ArrayList;

import java.util.Iterator;
public class Exercise1 {
   public static List<Integer> moveElementToEnd(List<Integer> list, int target) {
      // Write your code here.
      int i = 0;
      int j = 0;
      for (j = 0; j < list.size(); j++) {  // for loop to check each elem in the array
         if (list.get(j) != target) {  // comparing J with the target
            int temp = list.get(i);  // assign temp to the stored index
            list.set(i, list.get(j)); //
            list.set(j, temp);
            i++;
         }
      }
      return list;
   }


//      List<Integer> Add = new ArrayList<>();
//      List<Integer> List = new ArrayList<>();
//
//      //Loop through each element in list
//      for (int i = 0; i < list.size(); i++)
//      {
//         //get the element in x
//         int x = list.get(i);
//         if (x == target) { //If x is equal to toMove
//            Add.add(x); //Add to Add
//         } else {
//            List.add(x); //else add to List
//         }
//      }
//      List.addAll(Add); //Append Add to List
//      return List; //return the List
//   }


   //   int i = 0;
//      int j = 0;
//      for (j = 0; j < list.size(); j++) {
//         if (list.get(j) != target) {
//            int temp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, temp);
//            i++;
//         }
//      }
//      return list;
//   }




   public static void main(String[] args) {
      List<Integer> list;
      List<Integer> result;
      /*------------- START TEST 1 ---------------*/
      list = new ArrayList<>(List.of(2, 1, 2, 2, 2, 6, 8, 2));
      result = moveElementToEnd(list, 2);
      System.out.println(result + "\n");  // should print [1, 6, 8, 2, 2, 2, 2, 2]

      /*------------- START TEST 2 ---------------*/
      list = new ArrayList<>(List.of(1, 2, 3, 4));
      result = moveElementToEnd(list, 3);
      System.out.println(result + "\n");  // should print [1, 2, 4, 3]

      /*------------- START TEST 3 ---------------*/
      list = new ArrayList<>(List.of(0, 8, 3, 0));
      result = moveElementToEnd(list, 1);
      System.out.println(result + "\n");  // should print [0, 8, 3, 0]

      /*------------- START TEST 4 ---------------*/
      list = new ArrayList<>(List.of(4, 4, 4, 4, 4, 4, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12));
      result = moveElementToEnd(list, 4);
      System.out.println(result + "\n");  // should print [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4]

      /*------------- START TEST 5 ---------------*/
      list = new ArrayList<>(List.of());
      result = moveElementToEnd(list, 1);
      System.out.println(result + "\n");  // should print [1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4]

      /*------------- START TEST 6 ---------------*/
      list = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4));
      result = moveElementToEnd(list, 4);
      System.out.println(result + "\n");  // should print [1, 2, 3, 6, 7, 8, 9, 10, 11, 12, 4, 4, 4, 4, 4, 4, 4]

      /*------------- START TEST 7 ---------------*/
      list = new ArrayList<>(List.of(1, 1, 1, 1, 1));
      result = moveElementToEnd(list, 1);
      System.out.println(result + "\n");  // should print [1, 1, 1, 1, 1]
   }
}
