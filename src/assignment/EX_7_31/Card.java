package EX_7_31;

// Fig. 7.9: Card.java

public class Card {

    // face 和 suit 是 private 變數
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    public String toString() {
        return face + " of " + suit;
    }

    // 新增 getFace 和 getSuit
    public String getFace() {
        return this.face;
    }

    public String getSuit() {
        return this.suit;
    }
}