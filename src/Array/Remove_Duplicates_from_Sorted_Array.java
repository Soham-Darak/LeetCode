package Array;
// Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element
// appears only once. The relative order of the elements must be preserved.
//
// Let k be the number of unique elements in nums.
// After removing duplicates, return k.
//
// The first k elements of nums should contain the unique elements
// in sorted order. Elements beyond index k - 1 can be ignored.
//
// Custom Judge:
// The judge will test the solution using the following logic:
//
// int[] nums = [...];          // Input array
// int[] expectedNums = [...];  // Expected output array
//
// int k = removeDuplicates(nums); // Call the function
//
// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
//
// If all assertions pass, the solution is accepted.
//
// Example 1:
// Input: nums = [1, 1, 2]
// Output: k = 2, nums = [1, 2, _]
// Explanation:
// The function returns 2, and the first two elements are 1 and 2.
// Elements after index k - 1 do not matter.
//
// Example 2:
// Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
// Output: k = 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
// Explanation:
// The function returns 5, and the first five elements are unique.
// Remaining elements can be ignored.

public class Remove_Duplicates_from_Sorted_Array {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int i = 1;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[j - 1]) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
}
