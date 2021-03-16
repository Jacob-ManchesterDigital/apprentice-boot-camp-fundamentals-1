package cards;

public class MixedDeck extends BaseDeck {
    public MixedDeck() {
        Deck animalDeck = new AnimalDeck();
        while (animalDeck.areCardsRemaining()){
            cards.add(animalDeck.deal());
        }

        Deck playingCardDeck = new PlayingCardDeck();
        while (playingCardDeck.areCardsRemaining()){
            cards.add(playingCardDeck.deal());
        }
    }
}
