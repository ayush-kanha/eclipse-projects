package com.pract;

import java.util.Scanner;

import java.util.*;

class Combinations {
 
    // function which generates all possible n pairs of
    // balanced parentheses.
    // open : count of the number of open parentheses used
    // in generating the current string s. close : count of
    // the number of closed parentheses used in generating
    // the current string s. s : currently generated string/
    // ans : a vector of strings to store all the valid
    // parentheses.
    public static void
    generateParenthesis(int n, int open, int close,
                        String s, ArrayList<String> ans)
    {
 
        if (open == n && close == n) {
            ans.add(s);
            return;
        }
         
        if (open < n) {
            generateParenthesis(n, open + 1, close, s + "{",ans);
        }
         
        if (close < open) {
            generateParenthesis(n, open, close + 1, s + "}",ans);
        }
    }
 
    public static void main(String[] args)
    {
        int n = 3;
 
        // vector ans is created to store all the possible
        // valid combinations of the parentheses.
        ArrayList<String> ans = new ArrayList<>();
 
        // initially we are passing the counts of open and
        // close as 0, and the string s as an empty string.
        generateParenthesis(n, 0, 0, "", ans);
 
        // Now, here we print out all the combinations.
        for (String s : ans) {
            System.out.println(s);
        }
    }
}