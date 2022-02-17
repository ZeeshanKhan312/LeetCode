public class LeetCode_1_Two_Sum {
    /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

    //SOLUTION->
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer>result=new HashMap();
            for(int i=0;i<nums.length;i++){
                int rem=target-nums[i];
                if(result.containsKey(rem))
                    return new int[]{result.get(rem),i};
                result.put(nums[i],i);
            }
            return new int[]{0};
        }
    }
}
