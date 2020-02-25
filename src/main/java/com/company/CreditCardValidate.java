package com.company;

public class CreditCardValidate {

    public static boolean validate(String n) {
        // TODO: solution
        String[] digits = n.split("");
        Integer sum = 0;

        boolean isSecond = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (isSecond) {
                Integer newValue = Integer.parseInt(digits[i]) * 2;
                if (newValue >= 10) {
                    newValue -= 9;
                }
                sum += newValue;
            } else {
               sum += Integer.parseInt(digits[i]);
            }
            isSecond = !isSecond;
        }
        return sum%10 == 0;
    }

}
