public class LeetCode_881_Boats_to_Save_People {
    /*You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight
     of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.
Example 1:
Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3) */

    //SOLUTIONS-->
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            //Arrays.sort(people);
            //Applying CountSort Algo.
            int count[]=new int[limit+1];
            for(int p:people)
                count[p]++;
            int index=0;
            for(int i=1;i<=limit;i++){
                while(count[i]>0){
                    people[index++]=i;
                    count[i]--;
                }
            }
            //after sorting trying to match the lowest weight with hoghest one if it does.
            int l,r,min=0;
            l=0;
            r=people.length-1;
            while(l<=r){
                if(people[r]+people[l]<=limit){
                    r--;
                    l++;
                }
                else{
                    r--;
                }
                min++;
            }
            return min;
        }
    }
}
