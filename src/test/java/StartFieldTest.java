import Model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class startFieldTest {
    //creates new player to acces methods
    Player player = new Player("", 30000);

    @Test
    //checks if player start on start field which has placement 0
    public void startField() {
        assertTrue(player.getPlacement() == 0);
    }

}