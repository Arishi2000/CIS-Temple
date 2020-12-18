import java.util.ArrayList;
import java.util.Iterator;

public class Exercise4 {
    public static <E extends Comparable<E>> ArrayList<E> removeDups(ArrayList<E> list) {
            //  new arraylist
            ArrayList<E> result = new ArrayList<>();      //  new ArrayList

            if(list.isEmpty()){       // check if parameter of the list is empty, return res

                return result;
            }

            Iterator i = list.iterator();           // iterator for parameter list
            result.add((E) i.next());          // add first element to res of teh list
            while(i.hasNext()){         // loop til parameter list has elements

                boolean found = false;         // check element found or not
                E element = (E) i.next();
                // for-each element in result list
                for(E e:result){
                    // if elements equals with element from result list
                    if(element.compareTo(e) == 0){
                        // make flag true and break for-each loop
                        found = true;
                        break;
                    }
                }
                if(!found){                             // if false then element not found
                    result.add(element);                     // add element to result list
                }
            }
            return result;
        }
        public static void main(String[] args){
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1); list1.add(2); list1.add(1);
            list1.add(1); list1.add(3); list1.add(4);
            list1.add(2); list1.add(5);

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("A"); list2.add("B"); list2.add("A");
            list2.add("A"); list2.add("C"); list2.add("D");
            list2.add("B"); list2.add("E");

            // Print without duplicates
            System.out.println(removeDups(list1));

            // Print without duplicates
            System.out.println(removeDups(list2));
        }
    }

