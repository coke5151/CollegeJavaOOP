package EX_7_18;

import java.security.SecureRandom;

public class optionD {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {
        CONTINUE, WON, LOST
    };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        double totalPlayTimes = 1000000;
        double totalThrowDiceTimes = 0;
        for (int i = 0; i < totalPlayTimes; i++) {
            totalThrowDiceTimes += playOnceGame();
        }
        System.out.printf("Craps 遊戲平均長度 = %f 次投骰。", totalThrowDiceTimes / totalPlayTimes);
    }

    public static int playOnceGame() {
        int playTimes = 1;
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                break;
        }
        while (gameStatus == Status.CONTINUE) {
            playTimes++;
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }
        return playTimes;
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        return sum;
    }
}
