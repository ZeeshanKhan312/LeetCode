public class LeetCode_22_Generate_Parentheses {
    /* Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     Example 1:
     Input: n = 3
     Output: ["((()))","(()())","(())()","()(())","()()()"]*/

    //SOLUTION->
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> parenthesis=new ArrayList();
            backtrack(parenthesis,"",0,0,n);
            return parenthesis;
        }
        void backtrack(List<String>parenthesis,String currString,int open,int close,int max){
            if(currString.length()==max*2){  //*2 bcuz no pf arenthesis will be double as every open will have a close parenthesis
                parenthesis.add(currString);
                return;
            }
            if(open<max)
                backtrack(parenthesis,currString+"(",open+1,close,max);
            if(close<open)
                backtrack(parenthesis,currString+")",open,close+1,max);
        }
    }
}
