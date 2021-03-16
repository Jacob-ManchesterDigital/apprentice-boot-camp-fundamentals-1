package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseDeck implements Deck {
    protected List<Card> cards;

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String[] getCardNames() {
        ArrayList<String> result = new ArrayList<>();

        for (Card card : this.cards){
            result.add(card.toString());
        }

        return result.toArray(new String[cards.size()]);
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }
}
