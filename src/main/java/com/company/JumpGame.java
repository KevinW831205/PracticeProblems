package com.company;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(new JumpGame().jump(new int[]{2,3,1,1,4}));
    }
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int current = 0;
        int canTravel = nums[current];
        int steps = 0;

        int indexOfMaxReach = 0;
        int maxReach = 0;

        while (current < nums.length) {
            System.out.println("Current "+current);
            for (int i = 0; i < canTravel; i++) {
                int travelIndex = current + 1 + i;
                System.out.println("travel Index " + travelIndex);
                if (travelIndex == nums.length - 1) {
                    steps++;
                    return steps;
                }

                int reachAtI = travelIndex + nums[travelIndex];
                if (reachAtI > maxReach && nums[travelIndex] != 0) {
                    indexOfMaxReach = travelIndex;
                    maxReach = reachAtI;
                }
            }
            steps++;
            current = indexOfMaxReach;
            canTravel = nums[current];
        }

        return -1;
    }

}


