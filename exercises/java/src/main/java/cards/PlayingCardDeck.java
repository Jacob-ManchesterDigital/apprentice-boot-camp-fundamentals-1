package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck{
    private final List<PlayingCard> deckOfCards;

    public PlayingCardDeck() {
        deckOfCards = new ArrayList<>();
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deckOfCards.add(new PlayingCard(faceValue, suit));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deckOfCards);
    }

    @Override
    public Card deal() {
        return deckOfCards.remove(0);
    }

    @Override
    public String[] getCardNames() {
        ArrayList<String> result = new ArrayList<>();

        for (PlayingCard card : this.deckOfCards){
            result.add(card.toString());
        }

        return result.toArray(new String[deckOfCards.size()]);
    }
}
