import java.util.ArrayList;
import java.util.List;
public class TestSLList {
    public static void main(String[] args) {
        //       create instance of SLList class
        SLList list= new SLList();

        System.out.println("Adding elements 1 to 6 :");

//       add 6 elements
        for(int i=1;i<=6;i++) {
//           create instance of Item class and
            Item n= new Item(i);
//           add item to last node of LL
            list.addLast(n);
        }

//       Print The link list
        System.out.println(list.toString());

        System.out.println(); // printing space

        System.out.println("Delete 4th element");
        list.deleteKth(2);
        System.out.println(list.toString());

        System.out.println();
        System.out.println("Adding 4 After 2nd index ");
        Item item= new Item(4);
        list.addAfter(2, item);
        System.out.println(list.toString());

        System.out.println();

        System.out.println("Deleting After");
        list.removeAfter(list.getNode(2));
        System.out.println(list);




    }

}


