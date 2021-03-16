package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseDeck implements Deck {
    protected List<Card> cards = new ArrayList<>();;


    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    @Override
    public String[] getCardNames() {
        ArrayList<String> result = new ArrayList<>();

        for (Card card : this.cards){
            result.add(card.toString());
        }

        return result.toArray(new String[this.cards.size()]);
    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    public boolean areCardsRemaining() {
        return !this.cards.isEmpty();
    }
}
