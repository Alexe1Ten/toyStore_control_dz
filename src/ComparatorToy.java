import java.util.Comparator;

public class ComparatorToy implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        if (o1.getId() < o2.getId())
            return -1;
        if (o1.getId() > o2.getId())
            return 1;
        else
            return 0;
    }
}
