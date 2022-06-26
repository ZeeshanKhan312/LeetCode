public class LeetCode_704_Binary_Search {
    /* Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists,
     then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4 */

    // SOLUTION-->
    class Solution {
        public int search(int[] nums, int target) {
            int left=0;
            int right=nums.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[mid]== target)
                    return mid;
                else if(target>nums[mid])
                    left=mid+1;
                else
                    right=mid-1;
            }
            return -1;
        }
    }
}