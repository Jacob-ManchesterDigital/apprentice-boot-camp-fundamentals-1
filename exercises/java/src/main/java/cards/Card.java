package cards;

public class Card {
    String faceValueString;
    String suitString;

    public Card(int faceValue, int suit) {
        switch (faceValue){
            case 0: this.faceValueString = "ace"; break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: this.faceValueString = Integer.toString(faceValue+1); break;
            case 10: this.faceValueString = "jack"; break;
            case 11: this.faceValueString = "queen"; break;
            case 12: this.faceValueString = "king"; break;
            default: throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");
        }
        switch (suit){
            case 0: this.suitString = "clubs"; break;
            case 1: this.suitString = "diamonds"; break;
            case 2: this.suitString = "hearts"; break;
            case 3: this.suitString = "spades"; break;
            default: throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
        }
    }

    @Override
    public String toString() {
        return faceValueString + " of " + suitString;
    }


}
