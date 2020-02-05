package com.company;

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
            splice(tokens,i,2,val);
        }

        return 0;
    }

    private void splice(String[] tokens, int index, int numberToRemove, Double val) {

    }


}

