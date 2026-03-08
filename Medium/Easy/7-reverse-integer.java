/*
Problem: 7. Reverse Integer
Platform: LeetCode
Difficulty: Medium
Link: https://leetcode.com/problems/reverse-integer/

Approach:
Extract digits one by one using modulus (%) and division (/).
Build the reversed number by multiplying the current result by 10
and adding the extracted digit.

Before updating the result, check for integer overflow.
If the reversed value exceeds the 32-bit signed integer range,
return 0.

Time Complexity: O(log10(n))
Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
