import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

public class ControllerSuperhero {
private Database database;
private FileHandler fileHandler;


    //TODO kalde på add metoden fra ui
    //TODO kalde på delete metoden fra UI
    //TODO exit program
    public ControllerSuperhero() {
        database = new Database();
        fileHandler = new FileHandler();
    }

    public void addSuperhero(String name, String alias, String power, int year, double strength)
    {
       database.addSuperhero(name, alias, power, year, strength);
    }

    public ArrayList<Superhero> searchByAlias(String findHero)
    {
        return database.searchByAlias(findHero);
    }
    public ArrayList<Superhero> getHeros()
    {
        return database.getHeros();
    }

    public void loadSuperhero() {
        database.addArraySuperhero(fileHandler.loadListOfNames());
    }

    public void saveSuperhero() {
        fileHandler.saveListOfNames(database.getHeros());
    }

    public MessageEnum removeHero(int nr) {
        return database.removeSuperhero(nr);
    }

}
