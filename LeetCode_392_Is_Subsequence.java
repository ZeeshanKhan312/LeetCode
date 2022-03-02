public class LeetCode_392_Is_Subsequence {
    /* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the
relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true */

    //SOLUTION-->
    class Solution {
        public boolean isSubsequence(String s, String t) {
            if(s.length()==0) return true;
            if(t.length()==0||s.length()>t.length()) return false;
            int j=0;
            for(int i=0;i<t.length();i++){
                if(s.charAt(j)==t.charAt(i)){ //if j character of s matches with i char of t.
                    if(j==s.length()-1) //if it's the last character of s
                        return true;
                    j++;  //moving to next char of string 's'
                }
            }
            return false;

        }
    }
}
