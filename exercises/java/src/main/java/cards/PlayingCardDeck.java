package cards;

import java.util.ArrayList;

public class PlayingCardDeck extends BaseDeck{

    public PlayingCardDeck() {
        cards = new ArrayList<>();
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards.add(new PlayingCard(faceValue, suit));
            }
        }
    }

}
