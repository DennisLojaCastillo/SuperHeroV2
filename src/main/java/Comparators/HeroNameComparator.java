package Comparators;

import Data.Superhero;
import java.util.Comparator;

public class HeroNameComparator implements Comparator<Superhero> {
    public int compare(Superhero n1, Superhero n2) {
        return n1.getName().compareTo(n2.getName());
    }
}
