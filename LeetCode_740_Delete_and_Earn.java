public class LeetCode_740_Delete_and_Earn {
    /*You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:
    Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
    Return the maximum number of points you can earn by applying the above operation some number of times.
    Example 1:
    Input: nums = [3,4,2]
    Output: 6
    Explanation: You can perform the following operations:
            - Delete 4 to earn 4 points. Consequently, 3 is also deleted. nums = [2].
            - Delete 2 to earn 2 points. nums = [].
    You earn a total of 6 points.*/

    //SOLUTION-->
    class Solution {
        public int deleteAndEarn(int[] nums) {
            int inc=0;
            int exc=0;
            int max=0;
            int count[]=new int[10001];
            for(int i:nums){
                count[i]++;
                if(i>max)
                    max=i;
            }
            for(int i=0;i<=max;i++){
                int in=exc+count[i]*i;
                int ex=Math.max(exc,inc);
                inc=in;
                exc=ex;
            }
            return Math.max(inc,exc);
        }
    }
}
