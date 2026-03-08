/*
Problem: 1. Two Sum
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/two-sum/

Approach:
Use two nested loops to check every pair of elements in the array.
If the sum of nums[i] and nums[j] equals the target, return their indices.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){

                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
