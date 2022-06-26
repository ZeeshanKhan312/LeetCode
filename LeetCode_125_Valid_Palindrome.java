public class LeetCode_125_Valid_Palindrome {
    /* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
     */

    //SOLN-->
    class Solution {
        public:
        bool isPalindrome(string s) {
            int j=s.length()-1;
            int i=0;
            string str;
            for(i=0;i<=j;i++){
                if( s[i]>=48 && s[i]<=57 || s[i]>=97 && s[i]<=122) //for numbers and small char
                    str+=s[i];
                else if(s[i]>=65 && s[i]<=90) //for capital char
                    str+=s[i]+32;
            }
            i=0;
            j=str.length()-1;
            while(i<j){ //now comapring the new created sring without any non-alpha numeric char
                if(str[i]!=str[j])
                    return false;
                i++;
                j--;
            }
            return true;
        }
    };

}
