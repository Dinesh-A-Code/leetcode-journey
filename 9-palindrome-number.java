/*
Problem: 9. Palindrome Number
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/palindrome-number/

Approach:
If the number is negative, return false because negative numbers
cannot be palindromes.

Store the original number in a temporary variable.
Reverse the digits of the number using modulus (%) and division (/).
Compare the reversed number with the original number.
If they are equal, the number is a palindrome.

Time Complexity: O(log10(n))
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0)
            return false;

        int temp = x;
        int rev = 0;

        while(temp != 0){
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        if(rev == x){
            return true;
        }
        else{
            return false;
        }
    }
}
