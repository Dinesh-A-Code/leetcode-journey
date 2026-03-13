/*
Problem: 33. Search in Rotated Sorted Array
Platform: LeetCode
Difficulty: Medium
Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

Approach:
Use a linear search to traverse the array.
If the target element is found, return its index.
If the loop finishes without finding the element, return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int n = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                n = i;
                break;
            }
        }

        return n;
    }
}
