public class LeetCode_15_3Sum {
    /*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets. */

    //SOLUTION->
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums); //sorting the array
            List<List<Integer>> list = new LinkedList<>();
            for(int i=0;i<nums.length-2;i++){
                if(i>0 && nums[i]==nums[i-1])
                    continue;
                int l=i+1;
                int r=nums.length-1;
                int sum=0-nums[i];
                while(l<r){
                    if(nums[l]+nums[r]==sum){
                        list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while(l<r && nums[l]==nums[l+1]) //if the next left number is same
                            l++;
                        while(l<r &&nums[r]==nums[r-1]) //if the next right number is same
                            r--;
                        l++; //getting the next l value
                        r--;
                    }
                    else if(nums[l]+nums[r]<sum){
                        l++;
                    }
                    else{
                        r--;
                    }

                }
            }
            return list;
        }
    }
}
