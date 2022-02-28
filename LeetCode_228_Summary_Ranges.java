public class LeetCode_228_Summary_Ranges {
    /* You are given a sorted unique integer array nums.

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:
"a->b" if a != b
"a" if a == b

Example 1:
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7" */

    //SOLUTION->
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> result=new ArrayList<>();
            if(nums.length==0) return result;
            int j=nums[0];
            if(nums.length==1) {
                result.add(j+"");
                return result;
            }
            for(int i=1;i<nums.length;i++){
                if(nums[i]!= nums[i-1]+1 ){ //if num is not consecutive increasing
                    if(j==nums[i-1]) // if we get two nom consecutive increasing integer -> 3,5,7,8
                        result.add(j+"");
                    else
                        result.add(j+"->"+nums[i-1]);
                    j=nums[i];
                }
                if(i==nums.length-1){ //if we have eached the last element
                    if(j==nums[i]) // and there is only 1 element
                        result.add(j+"");
                    else // there are more than 1 element
                        result.add(j+"->"+nums[i]);
                }
            }

            return result;
        }
    }
}
