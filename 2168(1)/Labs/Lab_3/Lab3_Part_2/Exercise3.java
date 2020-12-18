import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {


        List<Integer> list1; // To test intersect method
        List<Integer> list1; // To test intersect method
        List<String> listStrings; // To test reverse method

        // Testing intersect method

        list1 = new ArrayList<>(List.of(1, 4, 8, 9, 11));
        list2 = new ArrayList<>(List.of(4, 7, 11, 17));
        System.out.println(union(list1, list1) + "\n"); // should print [31, 46, 52, 61]

        list1 = new ArrayList<>(List.of(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        list2 = new ArrayList<>(List.of(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
        System.out.println(union(list1, list2) + "\n"); // should print [4, 11, 17, 28, 59]

        list1 = new ArrayList<>(List.of(1, 3, 5, 7, 9, 10, 11));
        list2 = new ArrayList<>(List.of(2, 4, 6, 8, 9, 10, 11, 16, 18, 20, 22));
        System.out.println(union(list1, list2) + "\n"); // should print [9, 10, 11]


        // Testing reverse method

        listStrings = new ArrayList<>(List.of("Mercedes", "Toyota", "Volkswagen", "BMW", "Porsche", "Honda", "Ford"));
        System.out.println(reverse(listStrings) + "\n"); // should print [Ford, Honda, Porsche, BMW, Volkswagen, Toyota, Mercedes]

        listStrings = new ArrayList<>(List.of("Bangkok", "Paris", "London", "Dubai", "Singapore"));
        System.out.println(reverse(listStrings) + "\n"); // should print [Singapore, Dubai, London, Paris, Bangkok]

        listStrings = new ArrayList<>(List.of("George Washington", "John Adams", "Thomas Jefferson", "James Madison", "James Monroe", "John Quincy"));
        System.out.println(reverse(listStrings) + "\n"); // should print [John Quincy, James Monroe, James Madison, Thomas Jefferson, John Adams, George Washington]

    }

    // public static List<Integer> intersect(List<Integer> list1, List<Integer> list2) {
//        ArrayList<Integer> newList = new ArrayList<>();
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list1.get(i) == list2.get(j)) { // if elem found in 1 and 2 then add to newlist
//                    newList.add(list1.get(i));
//                }
//            }
//        }
//        return newList;
//        public static List<Integer> intersect(List<Integer> list1 , List<Integer> list2) {
//
//            ArrayList<Integer> result = new ArrayList<>();
//            for (Integer num : list1) {
//                if(list2.contains(num) && !result.contains(num))
//                    result.add(num);
//            }
//
//            return result;
//
//        }
    public static list<Integer> union(list<Integer> list1, list<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        for (Integer num : list2) {
            if (!result.contains(num)) result.add(num);
        }
        return result;
    }








    public static List<String> reverse(List<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) { // reversing in for loop
            newList.add(list.get(i));
        }
        return newList;
    }
}
