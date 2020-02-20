package com.company;

public class Greed {
    public static int greedy(int[] dice) {
        //code here
        int score = 0;

        int oneCount = count(1, dice);
        while (oneCount >= 3) {
            score += 1000;
            oneCount -= 3;
        }
        while (oneCount > 0) {
            score += 100;
            oneCount--;
        }

        int twoCount = count(2, dice);
        while (twoCount >= 3) {
            score += 200;
            twoCount--;
        }

        int threeCount = count(3, dice);
        while (threeCount >= 3) {
            score += 300;
            threeCount--;
        }

        int fourCount = count(4, dice);
        while (fourCount >= 3) {
            score += 400;
            fourCount--;
        }

        int fiveCount = count(5, dice);
        while (fiveCount >= 3) {
            score += 500;
            fiveCount--;
        }
        while (fiveCount > 0) {
            score += 50;
            fiveCount--;
        }

        int sixCount = count(6,dice);
        while (sixCount>6){
            score+=600;
            sixCount--;
        }

        return score;
    }

    private static int count(int number, int[] dice) {
        int count = 0;
        for (int die : dice) {
            if (die == number) {
                count++;
            }
        }
        return count;
    }
}
