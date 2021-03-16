package cards;

public class PlayingCardDeck {
    private final PlayingCard[] deckOfCards;

    public PlayingCardDeck() {
        deckOfCards = new PlayingCard[52];
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deckOfCards[suit*13+faceValue] = new PlayingCard(faceValue, suit);
            }
        }
    }

    PlayingCard[] getCards() {
        return deckOfCards;
    }
}
