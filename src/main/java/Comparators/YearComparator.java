package Comparators;

import Data.Superhero;
import java.util.Comparator;

public class YearComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero y1, Superhero y2) {
        return Integer.compare(y1.getYear(), y2.getYear());
    }
}
