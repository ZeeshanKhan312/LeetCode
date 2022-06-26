public class LeetCode_5_Longest_Palindromic_Substring {
    /* Given a string s, return the longest palindromic substring in s.
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer. */

    //SOLN-->
    class Solution {
        public String longestPalindrome(String s) {
            if(s==null || s.length()<1)
                return "";
            int start=0,end=0,cBest=0;
            for(int i=0;i<s.length();i++){
                int len1=palindrome(s,i,i); //if the size of the palindrome is odd
                int len2=palindrome(s,i,i+1); //if the size of the palindrome is even
                int len=Math.max(len1,len2);
                if(len>cBest){
                    cBest=len;
                    start=i-(len-1)/2;
                    end=i+len/2;
                }
            }
            return s.substring(start,end+1);
        }

        int palindrome(String s,int left,int right){  //palindrome is a string which reads the same backward
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            return right-left-1;
        }
    }
}
