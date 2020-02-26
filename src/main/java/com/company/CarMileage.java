package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        //Go to town

        if(checkInteresting(number,awesomePhrases)){
            return 2;
        } else if(checkInteresting(number+1, awesomePhrases) || checkInteresting(number+2, awesomePhrases)){
            return 1;
        }

        return 0;
    }

    private static boolean checkInteresting(int number, int[] awesomePhrases) {
        if (getIntegers(number) < 3) return false;
        Set<Integer> ap = new HashSet<>();
        Arrays.stream(awesomePhrases).forEach(ap::add);
        Integer num = number;
        if (ap.contains(number) || checkFollowedByZero(num) || checkSameNumberDigit(num) || checkSeqDec(num) || checkSeqInc(num) || isPalindrome(num)) {
            return true;
        }
        return false;
    }

    private static int getIntegers(int number) {
        return (int) (Math.log10(number) + 1);
    }

    private static boolean checkFollowedByZero(Integer num) {
        while (num >= 10) {
            if (num % 10 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    private static boolean checkSameNumberDigit(Integer num) {
        Integer digit = num % 10;
        while (num > 0) {
            if (num % 10 != digit) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static boolean checkSeqDec(Integer num) {
        int lastDigit = num % 10;
        while (num > 10) {
            lastDigit++;
            num /= 10;
            if (lastDigit != num % 10) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSeqInc(Integer num) {
        int lastDigit = num % 10;;
        if (lastDigit == 0) {
            lastDigit = 10;
        }
        while (num > 10) {
            lastDigit--;
            num /= 10;

            if (lastDigit != num % 10) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(Integer num) {
        StringBuilder sb = new StringBuilder(num.toString());
        if (sb.reverse().toString().equals(num.toString())) {
            return true;
        }
        return false;
    }

}
