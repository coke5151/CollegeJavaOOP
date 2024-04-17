
// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.
import java.security.SecureRandom;

public class EX_7_18 {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {
        CONTINUE, WON, LOST
    };

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args) {
        int[] winTimes = new int[21];
        int winAt = 0;
        for (int i = 0; i < 1000000; i++) {
            winAt = playOnceGame();
            if(1 <= winAt && winAt <= 20) {
                winTimes[winAt - 1]++;
            } else if (winAt > 20) {
                winTimes[20]++;
            }
        }

        for(int i = 0; i < 20; i++) {
            System.out.printf("在第 %d 次投骰玩家會獲勝的局數有：%d 局\n", i + 1, winTimes[i]);
        }
        System.out.printf("在第 20 次以後（不含）投骰玩家會獲勝的局數有：%d 局\n", winTimes[20]);
    }

    public static int playOnceGame() {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        int totalPlayTimes = 1; // 統計骰幾次才結束遊戲
        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                // System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE) { // not WON or LOST
            sumOfDice = rollDice(); // roll dice again
            totalPlayTimes++;

            // determine game status
            if (sumOfDice == myPoint) { // win by making point
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                    gameStatus = Status.LOST;
                }
            }
        }

        // display won or lost message
        if (gameStatus == Status.WON) {
            // System.out.println("Player wins");
            return totalPlayTimes;
        } else {
            // System.out.println("Player loses");
            return -1;
        }
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of die values

        // display results of this roll
        // System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/