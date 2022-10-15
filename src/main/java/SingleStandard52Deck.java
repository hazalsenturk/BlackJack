import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/**
 * A class that represents a deck of cards.
 * The deck is a map of cards and their count.
 * The deck is initialized with 52 cards.
 * The keys are the ranks of the cards.
 * The values represents the suits, starts with 4 and deducted by 1 each time a card is drawn.
 */
public class SingleStandard52Deck {
    protected Map<Integer,Integer> cards;

    public SingleStandard52Deck() {
        cards = new HashMap<>();
    }
    public Map<Integer, Integer> getCards() {
        return cards;
    }

    public void prepareDeck() {
        for (int i = 1; i < 14; i++) {
            cards.put(i,4);
        }
    }

}
