/*
Problem: 4. Median of Two Sorted Arrays
Platform: LeetCode
Difficulty: Hard
Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

Approach:
Combine both arrays into a single array.
Sort the combined array.
Then compute the median based on whether the total length is odd or even.

Time Complexity: O((m+n) log(m+n))
Space Complexity: O(m+n)
*/

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            arr[nums1.length + j] = nums2[j];
        }
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            return arr[n/2];
        }
    }
}
