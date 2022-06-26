public class LeetCode_9_Palindrome_Number {
    /* Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     */

    //SOLN-->

    using namespace std;
    class Solution {
        public:
        bool isPalindrome(int x) {
            string input= to_string(x);
            int n=input.length();
            int  i=0,y=n-1;
            while(i<y){
                if(input[i]!=input[y])
                    return 0;
                i++;
                y--;
            }
            return 1;

        }
    };
}
