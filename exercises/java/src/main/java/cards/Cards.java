package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = new PlayingCardDeck().getCardNames();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

}
