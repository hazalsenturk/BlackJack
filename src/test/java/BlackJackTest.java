import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackTest {

    @Test
    void optimalAce() {
        BlackJack blackJack = new BlackJack();
        assertEquals(11, blackJack.optimalAce(10));
        assertEquals(11, blackJack.optimalAce(9));
        assertEquals(1, blackJack.optimalAce(11));
        assertEquals(1, blackJack.optimalAce(12));
    }



}