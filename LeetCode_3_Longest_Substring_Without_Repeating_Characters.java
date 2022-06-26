public class LeetCode_3_Longest_Substring_Without_Repeating_Characters {
    /* Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. */

    //SOLN-->
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(s.length()==0) return 0;
            int []string=new int[96];
            int i=0,j=0;
            int longest=0;
            while(j<s.length()){
                if(string[s.charAt(j)-32]==0){
                    string[s.charAt(j)-32]=1;
                    j++;
                    longest=(longest>j-i)?longest:j-i;
                }
                else{
                    string[s.charAt(i)-32]=0;
                    i++;

                }
            }
            return longest;
        }
    }
}
