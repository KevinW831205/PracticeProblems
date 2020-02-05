package com.company;

import java.util.Arrays;

public class Calc {

    public double evaluate(String expr) {
        String[] tokens = expr.split(" ");

        for (int i = 0; i < tokens.length; i++) {
            Double val;
            if (tokens[i].matches("[0-9]+")) {
                continue;
            }
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

            if (tokens.length == 3) {
                return val;
            }

            tokens =  splice(tokens, i-2, 3, val);

            i = i - 3;
        }

        return 0;
    }

    public String[] splice(String[] tokens, int index, int numberToRemove, Double val) {
        String[] result = Arrays.copyOf(tokens, tokens.length - numberToRemove + 1);
        result[index] = val.toString();
        for (int i = 0; i < index; i++) {
            result[i] = tokens[i];
        }
        for (int i = index + 1; i < result.length; i++) {
            result[i] = tokens[i + numberToRemove - 1];
        }
        return result;
    }


}

