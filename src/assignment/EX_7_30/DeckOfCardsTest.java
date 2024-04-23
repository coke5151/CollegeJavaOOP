package EX_7_30;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        System.out.println("Hand:");
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        boolean noPair = true;
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = myDeckOfCards.dealCard();
            System.out.printf("%-19s", hand[i]);
        }
        System.out.println("\n牌型：");
        if (myDeckOfCards.isPair(hand)) {
            System.out.println("a pair");
            noPair = false;
        }
        if (myDeckOfCards.isTwoPairs(hand)) {
            System.out.println("two pairs");
            noPair = false;
        }
        if (myDeckOfCards.isThreeOfAKind(hand)) {
            System.out.println("three of a kind");
            noPair = false;
        }
        if (myDeckOfCards.isFourOfAKind(hand)) {
            System.out.println("four of a kind");
            noPair = false;
        }
        if (myDeckOfCards.isFlush(hand)) {
            System.out.println("a flush");
            noPair = false;
        }
        if (myDeckOfCards.isStraight(hand)) {
            System.out.println("a straight");
            noPair = false;
        }
        if (myDeckOfCards.isFullHouse(hand)) {
            System.out.println("a full house");
            noPair = false;
        }
        if (noPair) {
            System.out.println("no pair!");
        }
        System.out.println("==================");
    }
}