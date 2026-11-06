package com.csplusplus;

/*
 * AI Use Statement
 * ----------------
 * Did you use AI on this assignment? (yes / no):
 *
 * If yes, briefly describe how (planning, debugging, drafting code, etc.):
 *
 *
 * Reminder: retype any AI-generated code yourself. Do not paste it in.
 */

public class StringPractice {

    // Task 1: print every character of s, one per line.
    // Example: printChars("cat") prints c, then a, then t (each on its own line).
    public static void printChars(String s) {
        // PLAN (write your steps in plain English first):
        //

        // DO THIS: write your code below
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }

    // Task 2: print every character of s from LAST to FIRST, one per line.
    // Example: printReverse("cat") prints t, then a, then c.
    public static void printReverse(String s) {
        // PLAN (write your steps in plain English first):
        //

        // DO THIS: write your code below
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }

    }

    // Task 3: return how many times target appears inside text, including overlaps.
    // Example: countOccurrences("banana", "ana") returns 2.
    public static int countOccurrences(String text, String target) {
        // PLAN (write your steps in plain English first):
        //

        // DO THIS: write your code below
        int count = 0;
        int targetLen = target.length();
        for (int i = 0; i <= text.length() - target.length(); i++) {
            if (text.substring(i, i + targetLen).equals(target)) {
                count++;
            }
        }

        return count; // replace this line when your method is ready
    }

    // Task 4: return a NEW string with the word inserted after every word of the
    // sentence.
    // Example: insertWord("how is your morning going", "like")
    // returns "how like is like your like morning like going like"
    // Assume single spaces between words and no space at the start or end.
    public static String insertWord(String sentence, String word) {
        // PLAN (write your steps in plain English first):
        //

        // DO THIS: write your code below
        String result = "";
        int start = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.substring(i, i + 1).equals(" ")) {
                String currentword = sentence.substring(start, i);
                result = result + currentword + " " + word + " ";
                start = i + 1;

            }

        }
        String lastWord = sentence.substring(start);
        result = result + lastWord + " " + word;
        return result; // replace this line when your method is ready
    }

    // STRETCH A (optional): return true if s reads the same forward and backward.
    public static boolean isPalindrome(String s) {
        // DO THIS
        return false;
    }

    // STRETCH B (optional): return a NEW string with every copy of letter removed.
    public static String removeAll(String text, String letter) {
        // DO THIS
        return "";
    }

    public static void main(String[] args) {
        // Try your methods here. Run this file to see your output.
        printChars("cats");
        printReverse("cats");
        System.out.println(countOccurrences("Banana", "ana"));
        System.out.println(insertWord("how is your morning going", "like"));
    }

    /*
     * REFLECTION: Answer in your own words below.
     *
     * 1. Why does countOccurrences stop at text.length() - target.length()?
     *
     * Your answer:
     *
     * 2. Why can’t insertWord change the original sentence? Use the words immutable
     * and reassign.
     *
     * Your answer:
     *
     * 3. Which task was hardest, and what did you do when you got stuck?
     *
     * Your answer:
     */
}
