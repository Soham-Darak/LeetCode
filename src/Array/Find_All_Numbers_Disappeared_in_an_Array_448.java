package Array;
import java.util.*;
public class Find_All_Numbers_Disappeared_in_an_Array_448 {
/*
    LeetCode 448: Find All Numbers Disappeared in an Array

    Problem Statement:
    ------------------
    You are given an integer array nums of length n where:
    - Each element nums[i] is in the range [1, n]
    - Some elements may appear twice and others appear once

    Your task is to find all the numbers in the range [1, n]
    that do NOT appear in the array.

    Example:
    --------
    Input:  nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]

    Input:  nums = [1,1]
    Output: [2]

    Constraints:
    ------------
    1 ≤ n ≤ 10^5
    1 ≤ nums[i] ≤ n

    Requirement:
    ------------
    - Time Complexity should be O(n)
    - Extra Space should be O(1) (excluding output list)
*/

    class Solution {

    /*
        Approach:
        ---------
        Since values are in the range [1, n], each value maps directly
        to an index in the array.

        Mapping rule:
        Value x → Index (x - 1)

        We use the array itself to mark visited numbers by:
        - Converting the value at index (x - 1) to negative

        After marking:
        - If nums[i] is still positive, then number (i + 1) was never visited
    */

        public List<Integer> findDisappearedNumbers(int[] nums) {

            List<Integer> result = new ArrayList<>();

            // Step 1: Mark visited numbers
            for (int i = 0; i < nums.length; i++) {

                // Get index corresponding to current value
                int index = Math.abs(nums[i]) - 1;

                // Mark as visited by making value negative
                if (nums[index] > 0) {
                    nums[index] = -nums[index];
                }
            }

            // Step 2: Collect missing numbers
            for (int i = 0; i < nums.length; i++) {

                // If value is positive, index+1 was never visited
                if (nums[i] > 0) {
                    result.add(i + 1);
                }
            }

            return result;
        }
    }

}

