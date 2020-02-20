package com.company;

public class Greed {
    public static int greedy(int[] dice) {
        //code here
        int score = 0;
        int[] faceCount = count(dice);

        while (faceCount[0] >= 3) {
            score += 1000;
            faceCount[0] -= 3;
        }

        while (faceCount[0] > 0) {
            score += 100;
            faceCount[0]--;
        }
        while (faceCount[1] >= 3) {
            score += 200;
            faceCount[1] -= 3;
        }
        while (faceCount[2] >= 3) {
            score += 300;
            faceCount[2] -= 3;
        }
        while (faceCount[3] >= 3) {
            score += 400;
            faceCount[3] -= 3;
        }
        while (faceCount[4] >= 3) {
            score += 500;
            faceCount[4] -= 3;
        }
        while (faceCount[4] > 0) {
            score += 50;
            faceCount[4]--;
        }
        while (faceCount[5] >= 3) {
            score += 600;
            faceCount[5] -= 3;
        }


        return score;
    }

    private static int[] count(int[] dice) {
        int[] count = new int[6];
        for (int die : dice) {
            count[die - 1]++;
        }
        return count;
    }
}
