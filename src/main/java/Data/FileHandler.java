package Data;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

//    private Controller.ControllerSuperhero controller = new Controller.ControllerSuperhero();

    public void saveListOfNames(ArrayList<Superhero> s) {
        try {
            PrintStream saveToFile = new PrintStream("src/names.txt");
            for (Superhero superhero : s) {
                saveToFile.println(superhero.getName() + "," + superhero.getAlias()  + "," +  superhero.getPower()  + "," +  superhero.getYear() + "," + superhero.getStrength());
            }
        } catch (IOException e) {
            System.out.println("Fejl i kommunikation med fil");
        }
    }

    public ArrayList<Superhero> loadListOfNames() {
        ArrayList<Superhero> tempSuperheros = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("src/names.txt"));
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String[] att = name.split(",");
                Superhero tempSuperhero = new Superhero(
                        att[0],
                        att[1],
                        att[2],
                        Integer.parseInt(att[3]),
                        Double.parseDouble(att[4]));
                tempSuperheros.add(tempSuperhero);
            }
        } catch (IOException e) {
            System.out.println("Fejl i kommunikation med fil");
        }
        return tempSuperheros;
    }
}


