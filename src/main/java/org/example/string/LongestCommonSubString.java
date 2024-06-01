package org.example.string;

import java.util.stream.IntStream;

public class LongestCommonSubString {

    public static String longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0;
        int endIndex = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i - 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return s1.substring(endIndex - maxLen + 1, endIndex + 1);
    }

    public static String longestCommonSubstringJava8(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];
        int[] maxLen = {0};
        int[] endIndex = {0};

        IntStream.rangeClosed(1, m).forEach(i ->
                IntStream.rangeClosed(1, n).forEach(j -> {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        if (dp[i][j] > maxLen[0]) {
                            maxLen[0] = dp[i][j];
                            endIndex[0] = i - 1;
                        }
                    } else {
                        dp[i][j] = 0;
                    }
                }));

        return s1.substring(endIndex[0] - maxLen[0] + 1, endIndex[0] + 1);
    }

    public static void main(String[] args) {
        String s1 = "RajshreeSoni";
        String s2 = "MSSoniJi";

        String longestSubstring = longestCommonSubstring(s1, s2);
        String longestSubstringJava8 = longestCommonSubstringJava8(s1, s2);
        System.out.println("Longest common substring: " + longestSubstring);
        System.out.println("Longest common substring through java 8: " + longestSubstringJava8);
    }

    // We create a 2D array dp to store the lengths of common substrings found at each position of the two strings.
    //We iterate through the characters of both strings and update the dp array based on whether the characters match or not.
    //We maintain maxLen to keep track of the maximum length found so far and endIndex to store the ending index of the longest common substring.
    //Finally, we return the longest common substring using the endIndex and maxLen.
}

