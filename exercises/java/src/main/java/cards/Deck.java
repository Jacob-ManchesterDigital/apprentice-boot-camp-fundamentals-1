package cards;

public interface Deck {
    void shuffle();

    String[] getCardNames();

    Card deal();
}
