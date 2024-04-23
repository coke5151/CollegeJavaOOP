package EX_7_18;

import java.security.SecureRandom;

public class optionA {
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
        int[] winTimes = new int[21];
        int winAt = 0;
        for (int i = 0; i < 1000000; i++) {
            winAt = playOnceGame();
            if (1 <= winAt && winAt <= 20) {
                winTimes[winAt - 1]++;
            } else if (winAt > 20) {
                winTimes[20]++;
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("在第 %d 次投骰玩家會獲勝的局數有：%d 局\n", i + 1, winTimes[i]);
        }
        System.out.printf("在第 20 次以後（不含）投骰玩家會獲勝的局數有：%d 局\n", winTimes[20]);
    }

    public static int playOnceGame() {
        int myPoint = 0;
        Status gameStatus;
        int totalPlayTimes = 1;
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
            sumOfDice = rollDice();
            totalPlayTimes++;
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }
        if (gameStatus == Status.WON) {
            return totalPlayTimes;
        } else {
            return -1;
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        return sum;
    }
}
