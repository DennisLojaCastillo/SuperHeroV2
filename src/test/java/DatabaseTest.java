import Data.Database;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {


    @Test
    void addSuperhero() {
        //Opret Superhelt objekt og tilføj til arraylist

        //Arrange
        //Initialisere 'database'
        Database database = new Database();
        // int expectedSize = 1; **


        //Act
        database.addSuperhero("Clark Kent", "Super Man", "Everything", 1938, 9.9);
        // int actualSize = database.getAllSuperheroes().size(); **


        //Assert
        assertEquals(1,database.getHeros().size());
        // ** En anden måde at skrive det overstående linje.

    }
}