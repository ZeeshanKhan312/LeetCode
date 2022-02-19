public class LeetCode_17_Letter_Combinations_of_a_Phone_Number{
    /* Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     */

    //SOLUTION->
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> combination = new ArrayList<String>();
            if(digits==null || digits.length()==0)
                return combination;
            String[] map={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            combinationMaking(digits,combination,0,"",map);
            return combination;
        }

        public void combinationMaking(String digits,List<String> combination,int index,String current, String[] map) {
            if(index==digits.length()){
                combination.add(current);
                return;
            }
            String letter=map[digits.charAt(index)-'0'];
            for(int i=0;i<letter.length();i++)
            {
                combinationMaking(digits, combination, index+1, current+letter.charAt(i), map);
            }
        }
    }
}
