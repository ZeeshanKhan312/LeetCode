public class LeetCode_844_Backspace_String_Compare {
/*Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
 */

    //SOLUTION-->
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            int x=s.length()-1;
            int y=t.length()-1;
            int s_skip=0;
            int t_skip=0;
            while(x>=0 || y>=0){ //if any of the string has finished traversal
                while(x>=0){
                    if(s.charAt(x)=='#'){ //if there is a backspace
                        s_skip++; //upgrading the no of backspace to be done
                        x--; //going to next prvs element
                    }
                    else if(s_skip>0){
                        s_skip--; //degrading the no.of backspace
                        x--; //skipping the element bcuz of backspace
                    }
                    else
                        break;
                }
                while(y>=0){
                    if(t.charAt(y)=='#'){ //if there is a backspace
                        t_skip++; //upgrading the no of backspace to be done
                        y--; //going to next prvs element
                    }
                    else if(t_skip>0){
                        t_skip--; //degrading the no.of backspace
                        y--; //skipping the element bcuz of backspace
                    }
                    else
                        break;
                }
                if(x>=0 && y>=0 && s.charAt(x)!= t.charAt(y)) //checking if both the char. are same or not
                    return false;
                if((x>=0) != (y>=0)) //if any of the string has done traversing and other hasn't
                    return false;
                x--;
                y--;
            }
            return true;
        }
    }
}
