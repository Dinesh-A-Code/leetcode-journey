/*
Problem: 74. Search a 2D Matrix
Platform: LeetCode
Difficulty: Medium
Link: https://leetcode.com/problems/search-a-2d-matrix/

Approach:
Traverse the entire matrix using two nested loops.
Check each element to see if it matches the target.
If found, return true.
If not found after checking all elements, return false.

Time Complexity: O(m * n)
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
