package cards;

public class Deck {
    private final Card[] deckOfCards;

    public Deck() {
        deckOfCards = new Card[52];
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deckOfCards[suit*13+faceValue] = new Card(faceValue, suit);
            }
        }
    }

    Card[] getCards() {
        return deckOfCards;
    }
}
