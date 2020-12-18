import java.util.Comparator;

public class YearSort implements Comparator<President>{

    public int compare(President a1, President a2) {
        // TODO Auto-generated method stub

        return a1.year-a2.year;
    }

}