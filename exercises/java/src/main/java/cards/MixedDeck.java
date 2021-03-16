package cards;

import java.util.List;

public class MixedDeck extends BaseDeck {
    public MixedDeck() {
        cards.addAll(new AnimalDeck().cards);
        cards.addAll(new PlayingCardDeck().cards);
    }
}
