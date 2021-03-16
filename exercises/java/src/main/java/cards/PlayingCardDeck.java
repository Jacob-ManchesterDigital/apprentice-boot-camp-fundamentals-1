package cards;

import java.util.ArrayList;

public class PlayingCardDeck implements Deck{
    private final PlayingCard[] deckOfCards;

    public PlayingCardDeck() {
        deckOfCards = new PlayingCard[52];
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deckOfCards[suit*13+faceValue] = new PlayingCard(faceValue, suit);
            }
        }
    }

    PlayingCard[] getPlayingCards() {
        return deckOfCards;
    }

    @Override
    public void shuffle() {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public String[] getCardNames() {
        ArrayList<String> result = new ArrayList<>();
        PlayingCard[] deckOfCards = getPlayingCards();

        for (PlayingCard card : deckOfCards){
            result.add(card.toString());
        }

        return result.toArray(new String[52]);
    }
}
