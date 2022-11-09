package Comparators;

import Data.Superhero;
import java.util.Comparator;

public class PowerComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero p1, Superhero p2) {
        return p1.getPower().compareTo(p2.getPower());
    }
}
