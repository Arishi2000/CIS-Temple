import java.util.Comparator;

public class NameSort implements Comparator<President>{

    public int compare(President a1, President a2) {

        return a1.name.compareTo(a2.name);
    }

}

