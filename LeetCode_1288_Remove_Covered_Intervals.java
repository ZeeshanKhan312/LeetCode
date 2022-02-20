public class LeetCode_1288_Remove_Covered_Intervals {
    /*Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri), remove all intervals that are covered by another interval in the list.

The interval [a, b) is covered by the interval [c, d) if and only if c <= a and b <= d.

Return the number of remaining intervals.



Example 1:

Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
     */

    //SOLUTION->
    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals, new Comparator<int[]>() { //sorting the array in ascending order
                @Override              // code for sorting in 2d array according to our need
                public int compare( int[] entry1, int[] entry2) {
                    if(entry1[0]==entry2[0]){
                        if(entry1[1]<entry2[1]) //if ith value is same then sorting it using jth value-->[[1,4],[1,2]]
                            return 1;
                        else
                            return -1;
                    }
                    else if (entry1[0] > entry2[0])
                        return 1;
                    else
                        return -1;
                } });
            int result=0,cur=intervals[0][1]; //result shows the number of intervals in array
            for(int[] arr:intervals){
                if(arr[1]>cur)
                    result++; //if it's not covered then increasing the count of result
                if(arr[1]>cur)
                    cur=arr[1];
            }
            return result+1;
        }
    }
}
