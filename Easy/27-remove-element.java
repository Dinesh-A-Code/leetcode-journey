/*
Problem: 27. Remove Element
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/remove-element/

Approach:
Use a pointer k to track the position of valid elements.
Traverse the array and copy every element that is not equal to val
to index k, then increment k.

This effectively overwrites the elements equal to val.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for(int n : nums)
            if(n != val)
                nums[k++] = n;

        return k;
    }
}
