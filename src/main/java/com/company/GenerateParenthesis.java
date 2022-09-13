package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {

        System.out.println(generateParenthesis(1));
        /**
         ("", 0, 0, 1) ->
         ("(", 1, 0, 1) ->
         ("()",1, 1, 1) -> "()"
         **/


        System.out.println(generateParenthesis(3));

        /**
         ("", 0, 0, 3) ->
         ("(", 1, 0, 3) ->
         ("((", 2, 0, 3) +  ("()", 1, 1, 3) ->
         ("(((", 3, 0, 3) + ("(()", 2, 1, 3) + ("()(", 2, 1, 3) ->

         **/
    }

    public static List<String> generateParenthesis(int n) {
        /**
         * "" ->   "("
         * "(" -> "((" || "()"
         * "((" -> "((("  || "(()"    "()" -> "()("
         *
         *
         * */
        List<String> ans = new ArrayList<>();
        GenerateParenthesis.backTrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public static void backTrack(List<String> ans, StringBuilder cur, int open, int close, int max) {

        if (cur.length() == max * 2){
            ans.add(cur.toString());
            return;
        }

        if (open < max) {
            cur.append("(");
            backTrack(ans, cur, open+1, close, max);
            cur.deleteCharAt(cur.length()-1);
        }

        if (close < open) {
            cur.append(")");
            backTrack(ans, cur, open, close+1, max);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}
