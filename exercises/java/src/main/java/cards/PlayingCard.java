package cards;

public class PlayingCard {
    String faceValueString;
    String suitString;

    public PlayingCard(int faceValue, int suit) {
        this.faceValueString = convertFaceValueString(faceValue);
        this.suitString =  convertSuitString(suit);
    }

    private String convertSuitString(int suit) {
        String suitString;
        switch (suit){
            case 0: suitString = "clubs"; break;
            case 1: suitString = "diamonds"; break;
            case 2: suitString = "hearts"; break;
            case 3: suitString = "spades"; break;
            default: throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
        }
        return suitString;
    }

    private String convertFaceValueString(int faceValue) {
        String faceValueString;
        switch (faceValue){
            case 0: faceValueString = "ace"; break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: faceValueString = Integer.toString(faceValue +1); break;
            case 10: faceValueString = "jack"; break;
            case 11: faceValueString = "queen"; break;
            case 12: faceValueString = "king"; break;
            default: throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");
        }
        return faceValueString;
    }

    @Override
    public String toString() {
        return faceValueString + " of " + suitString;
    }
}
