package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];
        Card[] deckOfCards = new Card[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deckOfCards[suit*13+faceValue] = new Card(faceValue, suit);
            }
        }

        int cardCount = 0;
        for (Card card : deckOfCards){
            result[cardCount] = card.toString();
            cardCount++;
        }

        return result;
    }
}
