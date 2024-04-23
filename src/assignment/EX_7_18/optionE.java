package EX_7_18;

import java.security.SecureRandom;

public class optionE {
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
        int[] loseTimes = new int[21];
        int endAt = 0;
        for (int i = 0; i < 1000000; i++) {
            endAt = playOnceGame();
            if (endAt >= 0) {
                if (endAt > 20) {
                    winTimes[20]++;
                } else {
                    winTimes[endAt - 1]++;
                }
            } else {
                endAt = -endAt;
                if (endAt > 20) {
                    loseTimes[20]++;
                } else {
                    loseTimes[endAt - 1]++;
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("玩家在第 %d 次投骰獲勝的機率 = %f\n", i + 1,
                    (double) winTimes[i] / ((double) winTimes[i] + loseTimes[i]));
        }
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
            return -totalPlayTimes;
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        return sum;
    }
}
