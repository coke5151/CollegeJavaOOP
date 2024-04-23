package EX_7_30;

public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String toString() {
        return face + " of " + suit;
    }

    public String getFace() {
        return this.face;
    }

    public String getSuit() {
        return this.suit;
    }
}