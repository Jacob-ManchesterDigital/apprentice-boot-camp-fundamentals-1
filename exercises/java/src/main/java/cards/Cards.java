package cards;

import java.util.ArrayList;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    String[] getCards() {
        ArrayList<String> result = new ArrayList<>();
        PlayingCard[] deckOfCards = new PlayingCardDeck().getCards();

        for (PlayingCard card : deckOfCards){
            result.add(card.toString());
        }

        return result.toArray(new String[52]);
    }

}
