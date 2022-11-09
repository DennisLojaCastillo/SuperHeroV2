package Comparators;
import Data.Superhero;
import java.util.Comparator;


public class AliasComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero a1, Superhero a2) {
        return a1.getAlias().compareTo(a2.getAlias());
    }
}
