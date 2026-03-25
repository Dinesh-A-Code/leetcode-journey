/*
Problem: 3. Longest Substring Without Repeating Characters
Platform: LeetCode
Difficulty: Medium
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

Approach:
Use sliding window technique with two pointers (left and right).
Use a HashSet to store unique characters in the current window.

Expand the window by moving the right pointer.
If a duplicate character is found, shrink the window from the left
until the duplicate is removed.

Keep track of the maximum window size.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0, maxlen = 0;

        for(int right = 0; right < s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}
