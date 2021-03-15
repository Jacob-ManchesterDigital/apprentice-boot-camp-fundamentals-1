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
        int[][] deck = new int[52][2];
        Card[] deckOfCards = new Card[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit*13+faceValue] = new int[]{suit, faceValue};
                String faceValueName;
                switch (faceValue){
                    case 0: faceValueName = "ace"; break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: faceValueName = Integer.toString(faceValue+1); break;
                    case 10: faceValueName = "jack"; break;
                    case 11: faceValueName = "queen"; break;
                    case 12: faceValueName = "king"; break;
                    default: throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");
                }

                String suitName;
                switch (suit){
                    case 0: suitName = "clubs"; break;
                    case 1: suitName = "diamonds"; break;
                    case 2: suitName = "hearts"; break;
                    case 3: suitName = "spades"; break;
                    default: throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
                }
                deckOfCards[suit*13+faceValue] = new Card(faceValueName, suitName);
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
