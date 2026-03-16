/*
Problem: 58. Length of Last Word
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/length-of-last-word/

Approach:
First remove trailing spaces using trim().
Split the string by spaces into words.
Select the last word in the array and return its length.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int lengthOfLastWord(String s) {

        String[] c = s.trim().split(" ");
        String c1 = c[c.length - 1];

        return c1.length();
    }
}
