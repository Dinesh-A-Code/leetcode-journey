/*
Problem: 35. Search Insert Position
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/search-insert-position/

Approach:
Traverse the array and find the first position where the element
is greater than or equal to the target.

If such a position is found, return that index.
If the loop finishes without finding it, return nums.length
because the target should be inserted at the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {

        int value = nums.length;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                value = i;
                break;
            }
        }

        return value;
    }
}
