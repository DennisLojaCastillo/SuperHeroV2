import Data.Database;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {


    // ADD SUPERHERO
    @Test
    void addSuperhero() {
        //Opret Superhelt objekt og tilføj til arraylist
        //Arrange
        //Initialisere 'database'
        Database database = new Database();

        //Act
        database.addSuperhero("Clark Kent", "Super Man", "Everything", 1938, 9.9);
        int actualSize = database.getHeros().size();

        //Assert
        assertEquals(4, actualSize);
        // ** En anden måde at skrive det overstående linje.

    }

    // UPDATE SUPERHERO
    @Test
    void updateSuperhero() {
        Database database = new Database();

        //Act
        database.addSuperhero("Clark Kent", "Super Man", "Everything", 1938, 9.9);
        int actualSize = database.getHeros().size();
        database.getHeros().get(actualSize - 1).setStrength(20);

        //Assert
        assertEquals(20, 20);
    }

    // DELETE SUPERHERO
    @Test
    void deleteSuperhero() {
        Database database = new Database();

        //Act
        database.addSuperhero("Clark Kent", "Super Man", "Everything", 1938, 9.9);
        int actualSize = database.getHeros().size();
        database.removeSuperhero(actualSize - 1);

        //Assert
        assertEquals(4, actualSize);
    }
}