import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleStandard52DeckTest {

    @Test
    void prepareDeck() {
        SingleStandard52Deck deckTest = new SingleStandard52Deck();
        deckTest.prepareDeck();
        deckTest.getCards().values().forEach(value -> assertEquals(4, value));
        deckTest.getCards().keySet().forEach(key -> assertTrue(key > 0 && key < 14));

    }

}