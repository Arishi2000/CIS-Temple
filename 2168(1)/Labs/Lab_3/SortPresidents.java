import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortPresidents {
    List<President> list = new ArrayList<>();
    public static void main(String[] args) {
        new SortPresidents().go();
    }
    private void go() {
        populateList();
        for (President president : list) {
            System.out.println(president + " ");
        }
        System.out.println();
        // YOUR 1 LINE OF CODE THAT CREATES A NameSort COMPARATOR OBJECT:

        NameSort sortByNames =new NameSort(); // obeject for the sort method

        // YOUR 1 LINE OF CODE THAT SORTS PRESIDENTS BY NAME:
        Collections.sort(list, sortByNames);       // using sort method

        // YOUR 1 LINE OF CODE THAT PRINTS THE PRESIDENTS SORTED BY NAME:

        System.out.println(" Sorted by name: " +list); // printing the sorted list by name

        // YOUR 1 LINE OF CODE THAT CREATES A YearSort COMPARATOR OBJECT:

       YearSort yearSort =new YearSort();        // object for sort method

        // YOUR 1 LINE OF CODE THAT SORTS PRESIDENTS BY YEAR BELOW:

       Collections.sort(list, yearSort);            // using the sort method

        // YOUR 1 LINE OF CODE THAT PRINTS THE PRESIDENTS SORTED BY YEAR:

        System.out.println(" Sorted by year: " +list); // printing the sorted list by name

    }

    // populates the list with the instances of the President class (don't edit it)
    public void populateList() {
        President jimmy = new President("Jimmy", 1976);
        President ronny = new President("Ronald", 1980);
        President georgeH = new President("George-H", 1988);
        President bill = new President("Bill", 1992);
        President georgeW = new President("George-W", 2000);
        President barack  = new President("Barack", 2008);
        President don  = new President("Donald", 2016);

        list.add(bill);
        list.add(georgeW);
        list.add(georgeH);
        list.add(ronny);
        list.add(barack);
    }
}