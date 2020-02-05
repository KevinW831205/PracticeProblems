package com.company;

import java.util.Arrays;

public class Calc {

    public double evaluate(String expr) {
        String[] tokens = expr.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            Double val;
            switch (tokens[i]) {
                case "+":
                    val = Double.parseDouble(tokens[i - 2]) + Double.parseDouble(tokens[i - 1]);
                    break;
                case "-":
                    val = Double.parseDouble(tokens[i - 2]) - Double.parseDouble(tokens[i - 1]);
                    break;
                case "*":
                    val = Double.parseDouble(tokens[i - 2]) * Double.parseDouble(tokens[i - 1]);
                    break;
                case "/":
                    val = Double.parseDouble(tokens[i - 2]) / Double.parseDouble(tokens[i - 1]);
                    break;
                default:
                    continue;
            }
            splice(tokens, i, 3, val);
        }

        return 0;
    }

    public String[] splice(String[] tokens, int index, int numberToRemove, Double val) {
        String[] result = Arrays.copyOf(tokens, tokens.length - numberToRemove + 1);
        for (int i = 0; i<index; i++){
            result[i] = tokens[i];
            result[index] = val.toString();
        }
        System.out.println(result.length);
        for(int i=index+1; i<result.length; i++){
            result[i] = tokens[i+numberToRemove-1];
        }
        return result;
    }


}

