package cards;

public class Card {
    String faceValue;
    String suit;

    public Card(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}
