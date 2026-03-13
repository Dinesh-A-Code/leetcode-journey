/*
Problem: 34. Find First and Last Position of Element in Sorted Array
Platform: LeetCode
Difficulty: Medium
Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Approach:
Traverse the array from the beginning to find the first occurrence
of the target element.

Traverse the array from the end to find the last occurrence
of the target element.

If the target does not exist, return [-1, -1].

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] index = {-1, -1};

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index[0] = i;
                break;
            }
        }

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == target){
                index[1] = i;
                break;
            }
        }

        return index;
    }
}
