public class LeetCode_234_Palindrome_Linked_List {
    /* Given the head of a singly linked list, return true if it is a palindrome.
Example 1:
Input: head = [1,2,2,1]
Output: true
     */

    //SOLN-->
    /**
     * Definition for singly-linked list.
     * struct ListNode {
     *     int val;
     *     ListNode *next;
     *     ListNode() : val(0), next(nullptr) {}
     *     ListNode(int x) : val(x), next(nullptr) {}
     *     ListNode(int x, ListNode *next) : val(x), next(next) {}
     * };
     */
    class Solution {
        public:
        bool isPalindrome(ListNode* head) {
            vector<int> res;
            int j=0;
            while(head!=NULL){
                res.push_back(head->val);
                head=head->next;
                j++;
            }
            int i=0;
            j--;
            while(i<j){
                if(res[i]!=res[j])
                    return false;
                i++;
                j--;
            }
            return true;
        }
    };
}
