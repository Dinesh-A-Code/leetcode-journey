/*
Problem: 28. Find the Index of the First Occurrence in a String
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

Approach:
Use Java's built-in String method indexOf() to find the first occurrence
of the substring (needle) in the main string (haystack).

If the substring exists, indexOf() returns the starting index.
If it does not exist, it returns -1.

Time Complexity: O(n * m) in worst case
Space Complexity: O(1)
*/

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
