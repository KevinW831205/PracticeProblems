package com.company;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong

        int minToMeetLength = Math.max(6-password.length(),0);

        int bonusLength = 0;
        if(!password.matches(".*[!@#\\$%\\^&\\*\\(\\)\\-\\+].*")){
            bonusLength++;
        }
        if(!password.matches(".*[A-Z].*")){
            bonusLength++;
        }
        if(!password.matches(".*[a-z].*")){
            bonusLength++;
        }
        if(!password.matches(".*[0-9].*")){
            bonusLength++;
        }
        return Math.max(bonusLength,minToMeetLength);
    }
}
