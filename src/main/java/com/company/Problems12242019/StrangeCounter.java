package com.company.Problems12242019;

public class StrangeCounter {

    /*
    Bob has a strange counter. At the first second, it displays the number 3. Each second, the number displayed by the counter decrements by 1 until it reaches 1.

    The counter counts down in cycles. In next second, the timer resets to 2X the initial number for the prior cycle and continues counting down.
     The diagram below shows the counter values for each time t in the first three cycles:
     */

    public static long strangeCounter(long t) {

        //3
        //6
        //12
        //24

        long sum = 0;
        int n=0;
        while(t> 3* Math.pow(2,n)){
            sum += 3*Math.pow(2,n);
            n++;
        }
        long result = t - sum;

        return result;
    }

}
