package cards;

public class PlayingCardDeck extends BaseDeck{

    public PlayingCardDeck() {
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards.add(new PlayingCard(faceValue, suit));
            }
        }
    }

}
