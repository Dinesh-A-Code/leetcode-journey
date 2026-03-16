/*
Problem: 26. Remove Duplicates from Sorted Array
Platform: LeetCode
Difficulty: Easy
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

Approach:
Use two pointers.
Pointer i scans through the array.
Pointer k keeps track of the position where the next unique element
should be placed.

If the current element is different from the previous one,
store it at index k and increment k.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
